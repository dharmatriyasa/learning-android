package com.example.gridlist.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gridlist.model.CardData
import com.example.gridlist.R
import com.example.gridlist.data.DataSource

@Composable
fun TopicCard(modifier: Modifier = Modifier, card: CardData) {
    Card(
        modifier = modifier
    ) {
        Row {
            Image(
                modifier = Modifier
                    .height(68.dp)
                    .width(68.dp),
                painter = painterResource(card.leftImage),
                contentDescription = stringResource(card.title),
            )
            Column(
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {
                Text(
                    modifier = Modifier
                      .padding(
                          top = 16.dp,
                          bottom = 8.dp,
                          ),
                    text = stringResource(card.title),
                    style = MaterialTheme.typography.bodyMedium,
                )
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.ic_grain),
                        contentDescription = stringResource(card.title)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(
                        text = card.count.toString(),
                        style = MaterialTheme.typography.labelMedium,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun TopicCardPreview() {
    val data = DataSource.topics[1]
    TopicCard(modifier = Modifier, card = data)
}