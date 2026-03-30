package com.example.superheroesapp.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.superheroesapp.data.HeroesRepository


@Composable
fun HeroesScreen(
    modifier: Modifier = Modifier,
) {
    val heroes = HeroesRepository.heroes
    LazyColumn(modifier) {
        items(heroes) { hero ->
            HeroCardView(
                title = stringResource(hero.nameRes),
                description = stringResource(hero.descriptionRes),
                heroImage = hero.imageRes,
            )
        }
    }
}

@Preview
@Composable
fun HeroesScreenPreview() {
    HeroesScreen()
}