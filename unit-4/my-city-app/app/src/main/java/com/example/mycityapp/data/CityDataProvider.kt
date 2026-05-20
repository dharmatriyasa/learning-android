package com.example.mycityapp.data

object CityDataProvider {
    val categories = """
        [
          {
            "itemId": "cat_001",
            "imageUrl": "https://picsum.photos/seed/culinary/400/300",
            "title": "Culinary",
            "description": "Discover the best restaurants, cafes, and street food around the city"
          },
          {
            "itemId": "cat_002",
            "imageUrl": "https://picsum.photos/seed/cafe/400/300",
            "title": "Cafe",
            "description": "Find cozy spots to enjoy coffee, tea, and light bites"
          },
          {
            "itemId": "cat_003",
            "imageUrl": "https://picsum.photos/seed/attraction/400/300",
            "title": "Attraction",
            "description": "Explore top landmarks, monuments, and must-visit spots in the city"
          },
          {
            "itemId": "cat_004",
            "imageUrl": "https://picsum.photos/seed/marketplace/400/300",
            "title": "Marketplace",
            "description": "Shop local products, souvenirs, and everyday essentials at nearby markets"
          },
          {
            "itemId": "cat_005",
            "imageUrl": "https://picsum.photos/seed/nature/400/300",
            "title": "Park",
            "description": "Unwind at parks, gardens, and green spaces across the city"
          },
          {
            "itemId": "cat_006",
            "imageUrl": "https://picsum.photos/seed/entertainment/400/300",
            "title": "Entertainment",
            "description": "Catch events, cinemas, arcades, and fun activities for all ages"
          },
          {
            "itemId": "cat_007",
            "imageUrl": "https://picsum.photos/seed/accommodation/400/300",
            "title": "Accommodation",
            "description": "Browse hotels, guesthouses, and homestays for a comfortable stay"
          }
        ]
    """.trimIndent()

    val culinary = """
        [
          {
            "itemId": "rec_cul_005",
            "imageUrl": "https://picsum.photos/seed/gadogado/400/300",
            "title": "Gado-Gado Bu Yanti",
            "description": "Fresh vegetables and tofu smothered in rich homemade peanut sauce, a local favorite"
          },
          {
            "itemId": "rec_cul_006",
            "imageUrl": "https://picsum.photos/seed/bebekgoreng/400/300",
            "title": "Bebek Goreng Pak Slamet",
            "description": "Crispy fried duck seasoned with traditional Javanese spices, served with sambal"
          },
          {
            "itemId": "rec_cul_007",
            "imageUrl": "https://picsum.photos/seed/rawon/400/300",
            "title": "Rawon Khas Surabaya",
            "description": "Dark beef soup made with keluak nuts, a bold and earthy East Javanese specialty"
          },
          {
            "itemId": "rec_cul_008",
            "imageUrl": "https://picsum.photos/seed/ayambakar/400/300",
            "title": "Ayam Bakar Taliwang",
            "description": "Grilled chicken marinated in Lombok-style spicy sauce, charcoal-grilled to perfection"
          },
          {
            "itemId": "rec_cul_009",
            "imageUrl": "https://picsum.photos/seed/ketoprak/400/300",
            "title": "Ketoprak Betawi Asli",
            "description": "Tofu, rice cake, and vermicelli tossed in a savory peanut and soy sauce dressing"
          },
          {
            "itemId": "rec_cul_010",
            "imageUrl": "https://picsum.photos/seed/pempek/400/300",
            "title": "Pempek Palembang",
            "description": "Authentic fish cakes from Palembang served with tangy vinegar-based cuko sauce"
          },
          {
            "itemId": "rec_cul_011",
            "imageUrl": "https://picsum.photos/seed/nasiliwet/400/300",
            "title": "Nasi Liwet Solo",
            "description": "Coconut-infused rice served with chicken, egg, and rich opor sauce from Solo tradition"
          },
          {
            "itemId": "rec_cul_012",
            "imageUrl": "https://picsum.photos/seed/bakso/400/300",
            "title": "Bakso Malang Cak Eko",
            "description": "Hearty meatball soup loaded with fried tofu, siomay, and springy noodles"
          },
          {
            "itemId": "rec_cul_013",
            "imageUrl": "https://picsum.photos/seed/tongseng/400/300",
            "title": "Tongseng Kambing Pak Haji",
            "description": "Slow-cooked goat meat in sweet soy and coconut milk broth with fresh vegetables"
          },
          {
            "itemId": "rec_cul_014",
            "imageUrl": "https://picsum.photos/seed/rujakcingur/400/300",
            "title": "Rujak Cingur Surabaya",
            "description": "A unique Surabaya salad combining cow snout, vegetables, and thick shrimp paste sauce"
          }
        ]
    """.trimIndent()

    val cafe = """
        [
          {
            "itemId": "rec_caf_005",
            "imageUrl": "https://picsum.photos/seed/roastery/400/300",
            "title": "Biji Kopi Roastery",
            "description": "In-house roasted beans brewed to order, great for coffee enthusiasts and pour-over fans"
          },
          {
            "itemId": "rec_caf_006",
            "imageUrl": "https://picsum.photos/seed/bookshop/400/300",
            "title": "Taman Baca Cafe",
            "description": "A bookshop cafe hybrid where you can sip matcha latte while browsing curated reads"
          },
          {
            "itemId": "rec_caf_007",
            "imageUrl": "https://picsum.photos/seed/rooftop/400/300",
            "title": "Rooftop Brew",
            "description": "Open-air rooftop cafe with stunning city views, cold brew on tap, and live acoustic sets"
          },
          {
            "itemId": "rec_caf_008",
            "imageUrl": "https://picsum.photos/seed/minimalist/400/300",
            "title": "Mono Coffee",
            "description": "Minimalist black-and-white cafe with expertly crafted espresso and homemade cheesecake"
          },
          {
            "itemId": "rec_caf_009",
            "imageUrl": "https://picsum.photos/seed/kopitiam/400/300",
            "title": "Warung Kopi Tiam",
            "description": "A nostalgic old-school kopitiam serving traditional kopi, teh tarik, and kaya toast"
          },
          {
            "itemId": "rec_caf_010",
            "imageUrl": "https://picsum.photos/seed/forestcafe/400/300",
            "title": "The Forest Cafe",
            "description": "Plant-filled indoor jungle cafe with herbal teas, vegan bites, and calming ambiance"
          },
          {
            "itemId": "rec_caf_011",
            "imageUrl": "https://picsum.photos/seed/breakfast/400/300",
            "title": "Pagi Sore Coffee House",
            "description": "All-day breakfast cafe with Indonesian-style coffee and fresh toasted sandwiches"
          },
          {
            "itemId": "rec_caf_012",
            "imageUrl": "https://picsum.photos/seed/galerykopi/400/300",
            "title": "Galeri Kopi",
            "description": "An art gallery combined with a cafe, rotating local artworks alongside seasonal drinks"
          },
          {
            "itemId": "rec_caf_013",
            "imageUrl": "https://picsum.photos/seed/brunch/400/300",
            "title": "Weekend Brunch Co.",
            "description": "Known for its indulgent weekend brunch menu, pancake stacks, and bottomless coffee"
          },
          {
            "itemId": "rec_caf_014",
            "imageUrl": "https://picsum.photos/seed/dessertcafe/400/300",
            "title": "Cloud Nine Dessert Cafe",
            "description": "Specialty dessert cafe serving cloud-soft soufflé pancakes, waffles, and crepe cakes"
          }
        ]
    """.trimIndent()

    val attraction = """
        [
          {
            "itemId": "rec_att_005",
            "imageUrl": "https://picsum.photos/seed/stonebridge/400/300",
            "title": "Colonial Stone Bridge",
            "description": "A centuries-old bridge with stunning architecture and great photography opportunities"
          },
          {
            "itemId": "rec_att_006",
            "imageUrl": "https://picsum.photos/seed/batikmuseum/400/300",
            "title": "Batik Heritage Museum",
            "description": "Discover the history and craft of Indonesian batik through interactive displays and demos"
          },
          {
            "itemId": "rec_att_007",
            "imageUrl": "https://picsum.photos/seed/lightfestival/400/300",
            "title": "City Light Festival",
            "description": "A seasonal outdoor light installation event transforming city parks into glowing wonderlands"
          },
          {
            "itemId": "rec_att_008",
            "imageUrl": "https://picsum.photos/seed/wayang/400/300",
            "title": "Wayang Puppet Theater",
            "description": "Traditional shadow puppet performances telling epic stories from Javanese mythology"
          },
          {
            "itemId": "rec_att_009",
            "imageUrl": "https://picsum.photos/seed/streetart/400/300",
            "title": "Street Art District",
            "description": "A neighborhood canvas of vibrant murals and graffiti art by local and international artists"
          },
          {
            "itemId": "rec_att_010",
            "imageUrl": "https://picsum.photos/seed/observationtower/400/300",
            "title": "Observation Tower",
            "description": "Ride up to the top for a 360-degree panoramic view of the entire city landscape"
          },
          {
            "itemId": "rec_att_011",
            "imageUrl": "https://picsum.photos/seed/sciencecenter/400/300",
            "title": "City Science Center",
            "description": "Hands-on science exhibits and planetarium shows perfect for families and curious minds"
          },
          {
            "itemId": "rec_att_012",
            "imageUrl": "https://picsum.photos/seed/spiceroute/400/300",
            "title": "Spice Trade Route Walk",
            "description": "A guided historical walking tour tracing the city's roots as a major spice trading hub"
          },
          {
            "itemId": "rec_att_013",
            "imageUrl": "https://picsum.photos/seed/kratonpalace/400/300",
            "title": "Royal Kraton Palace",
            "description": "Explore the grand royal palace grounds showcasing Javanese architecture and royal artifacts"
          },
          {
            "itemId": "rec_att_014",
            "imageUrl": "https://picsum.photos/seed/oldharbor/400/300",
            "title": "Old Harbor Viewpoint",
            "description": "A historic harbor area with traditional wooden ships, fish markets, and scenic sea views"
          }
        ]
    """.trimIndent()

    val marketplace = """
        [
          {
            "itemId": "rec_mkt_005",
            "imageUrl": "https://picsum.photos/seed/fleamarket/400/300",
            "title": "Sunday Flea Market",
            "description": "A weekend flea market with second-hand treasures, vintage clothing, and unique collectibles"
          },
          {
            "itemId": "rec_mkt_006",
            "imageUrl": "https://picsum.photos/seed/farmersmarket/400/300",
            "title": "Organic Farmers Market",
            "description": "Fresh organic produce, homemade jams, artisan bread, and natural skincare products"
          },
          {
            "itemId": "rec_mkt_007",
            "imageUrl": "https://picsum.photos/seed/fabricmarket/400/300",
            "title": "Fabric & Textile District",
            "description": "Row upon row of fabric shops selling batik, tenun, songket, and imported textiles"
          },
          {
            "itemId": "rec_mkt_008",
            "imageUrl": "https://picsum.photos/seed/techbazaar/400/300",
            "title": "Tech & Gadget Bazaar",
            "description": "The go-to spot for electronics, phone accessories, second-hand gadgets, and tech repairs"
          },
          {
            "itemId": "rec_mkt_009",
            "imageUrl": "https://picsum.photos/seed/flowermarket/400/300",
            "title": "Bunga Indah Flower Market",
            "description": "A colorful 24-hour flower market bursting with fresh blooms, plants, and floral arrangements"
          },
          {
            "itemId": "rec_mkt_010",
            "imageUrl": "https://picsum.photos/seed/souvenirlane/400/300",
            "title": "Souvenir Lane",
            "description": "The best place to pick up local keepsakes, miniature landmarks, and handcrafted gifts"
          },
          {
            "itemId": "rec_mkt_011",
            "imageUrl": "https://picsum.photos/seed/potterymarket/400/300",
            "title": "Pottery Village Market",
            "description": "Browse handmade clay pottery, ceramic tableware, and traditional earthenware from local artisans"
          },
          {
            "itemId": "rec_mkt_012",
            "imageUrl": "https://picsum.photos/seed/bookmarket/400/300",
            "title": "Second-Hand Book Market",
            "description": "Stacks of used books at bargain prices spanning fiction, history, comics, and academic titles"
          },
          {
            "itemId": "rec_mkt_013",
            "imageUrl": "https://picsum.photos/seed/spicemarket/400/300",
            "title": "Rempah Spice Market",
            "description": "Aromatic stalls filled with dried spices, herbs, and traditional jamu ingredients"
          },
          {
            "itemId": "rec_mkt_014",
            "imageUrl": "https://picsum.photos/seed/popupmarket/400/300",
            "title": "Creative Pop-Up Market",
            "description": "Monthly rotating market featuring independent designers, handmade goods, and local food brands"
          }
        ]
    """.trimIndent()

    val park = """
        [
          {
            "itemId": "rec_nat_005",
            "imageUrl": "https://picsum.photos/seed/mangrove/400/300",
            "title": "Mangrove Conservation Park",
            "description": "Walk on elevated boardwalks through dense mangrove forests teeming with wildlife"
          },
          {
            "itemId": "rec_nat_006",
            "imageUrl": "https://picsum.photos/seed/waterfall/400/300",
            "title": "Hidden Waterfall Trail",
            "description": "A scenic 2-hour hike leading to a secluded waterfall surrounded by tropical greenery"
          },
          {
            "itemId": "rec_nat_007",
            "imageUrl": "https://picsum.photos/seed/rooftopgarden/400/300",
            "title": "Community Rooftop Garden",
            "description": "An urban rooftop garden where locals grow vegetables and host gardening workshops"
          },
          {
            "itemId": "rec_nat_008",
            "imageUrl": "https://picsum.photos/seed/birdsanctuary/400/300",
            "title": "City Bird Sanctuary",
            "description": "A protected habitat home to hundreds of local and migratory bird species"
          },
          {
            "itemId": "rec_nat_009",
            "imageUrl": "https://picsum.photos/seed/sunsetbeach/400/300",
            "title": "Sunset Beach Park",
            "description": "A relaxing coastal park ideal for evening walks, picnics, and golden hour sunsets"
          },
          {
            "itemId": "rec_nat_010",
            "imageUrl": "https://picsum.photos/seed/bambooforest/400/300",
            "title": "Bamboo Forest Walk",
            "description": "A peaceful pathway through towering bamboo groves with natural sound and fresh air"
          },
          {
            "itemId": "rec_nat_011",
            "imageUrl": "https://picsum.photos/seed/lakepark/400/300",
            "title": "Danau Tenang Lake Park",
            "description": "Rent a paddle boat and enjoy a calm afternoon on the lake surrounded by lush trees"
          },
          {
            "itemId": "rec_nat_012",
            "imageUrl": "https://picsum.photos/seed/ricefield/400/300",
            "title": "Rice Field Pathway",
            "description": "A scenic walk through active rice terraces offering a glimpse into local farming life"
          },
          {
            "itemId": "rec_nat_013",
            "imageUrl": "https://picsum.photos/seed/orchidgarden/400/300",
            "title": "Orchid Garden",
            "description": "A curated garden showcasing hundreds of rare and exotic orchid species in full bloom"
          },
          {
            "itemId": "rec_nat_014",
            "imageUrl": "https://picsum.photos/seed/camping/400/300",
            "title": "City Edge Camping Ground",
            "description": "A well-maintained camping area at the city's edge, perfect for stargazing and outdoor stays"
          }
        ]
    """.trimIndent()

    val entertainment = """
        [
          {
            "itemId": "rec_ent_005",
            "imageUrl": "https://picsum.photos/seed/comedyclub/400/300",
            "title": "Laugh Factory Comedy Club",
            "description": "Stand-up comedy nights featuring local and national comedians every Friday and Saturday"
          },
          {
            "itemId": "rec_ent_006",
            "imageUrl": "https://picsum.photos/seed/bowling/400/300",
            "title": "Strike Bowling Alley",
            "description": "Modern 20-lane bowling alley with neon lighting, a full snack bar, and weekend tournaments"
          },
          {
            "itemId": "rec_ent_007",
            "imageUrl": "https://picsum.photos/seed/trampoline/400/300",
            "title": "Jump Arena Trampoline Park",
            "description": "An indoor trampoline park with foam pits, dodgeball courts, and parkour zones for all ages"
          },
          {
            "itemId": "rec_ent_008",
            "imageUrl": "https://picsum.photos/seed/karaoke/400/300",
            "title": "Karaoke Box Premium",
            "description": "Private karaoke rooms with extensive song libraries, great sound systems, and party packages"
          },
          {
            "itemId": "rec_ent_009",
            "imageUrl": "https://picsum.photos/seed/puppettheater/400/300",
            "title": "Children Puppet Theater",
            "description": "Weekend puppet and storytelling shows designed to entertain and educate young children"
          },
          {
            "itemId": "rec_ent_010",
            "imageUrl": "https://picsum.photos/seed/jazzbar/400/300",
            "title": "Blue Note Jazz Bar",
            "description": "Intimate jazz bar with nightly live performances, craft cocktails, and a warm atmosphere"
          },
          {
            "itemId": "rec_ent_011",
            "imageUrl": "https://picsum.photos/seed/vrzone/400/300",
            "title": "VR Experience Zone",
            "description": "Cutting-edge virtual reality games and simulations for solo players and group adventures"
          },
          {
            "itemId": "rec_ent_012",
            "imageUrl": "https://picsum.photos/seed/openaircinema/400/300",
            "title": "Open Air Cinema",
            "description": "Outdoor movie screenings under the stars with bean bag seating and street food stalls"
          },
          {
            "itemId": "rec_ent_013",
            "imageUrl": "https://picsum.photos/seed/lasertag/400/300",
            "title": "Laser Tag Arena",
            "description": "Multi-level laser tag battlefield with fog machines and mission-based team gameplay"
          },
          {
            "itemId": "rec_ent_014",
            "imageUrl": "https://picsum.photos/seed/dancestudio/400/300",
            "title": "Groove Dance Studio",
            "description": "Drop-in dance classes spanning hip-hop, salsa, K-pop, and contemporary for all skill levels"
          }
        ]
    """.trimIndent()

    val accommodation = """
        [
          {
            "itemId": "rec_acc_005",
            "imageUrl": "https://picsum.photos/seed/capsulehotel/400/300",
            "title": "Urban Capsule Hotel",
            "description": "Compact and modern capsule pods with privacy curtains, personal TV, and secure lockers"
          },
          {
            "itemId": "rec_acc_006",
            "imageUrl": "https://picsum.photos/seed/riversideresort/400/300",
            "title": "Riverside Resort & Spa",
            "description": "Luxurious riverside resort with overwater bungalows, infinity pool, and full-service spa"
          },
          {
            "itemId": "rec_acc_007",
            "imageUrl": "https://picsum.photos/seed/arthotel/400/300",
            "title": "The Art House Hotel",
            "description": "A design hotel where every room is curated by a different local artist, a truly unique stay"
          },
          {
            "itemId": "rec_acc_008",
            "imageUrl": "https://picsum.photos/seed/ecolodge/400/300",
            "title": "Eco Lodge Nusantara",
            "description": "Sustainable bamboo lodge powered by solar energy, surrounded by tropical gardens and birdsong"
          },
          {
            "itemId": "rec_acc_009",
            "imageUrl": "https://picsum.photos/seed/familyresort/400/300",
            "title": "Familio Family Resort",
            "description": "Family-friendly resort with a waterpark, kids club, and spacious connecting room suites"
          },
          {
            "itemId": "rec_acc_010",
            "imageUrl": "https://picsum.photos/seed/servicedapartment/400/300",
            "title": "CityStay Serviced Apartments",
            "description": "Fully furnished apartments with kitchen and laundry, ideal for extended stays and remote workers"
          },
          {
            "itemId": "rec_acc_011",
            "imageUrl": "https://picsum.photos/seed/treehouse/400/300",
            "title": "Treehouse Glamping",
            "description": "Elevated wooden treehouses with open-air decks, romantic lighting, and jungle views"
          },
          {
            "itemId": "rec_acc_012",
            "imageUrl": "https://picsum.photos/seed/businesshotel/400/300",
            "title": "Pinnacle Business Hotel",
            "description": "Corporate-grade hotel with conference rooms, express laundry, and airport shuttle service"
          },
          {
            "itemId": "rec_acc_013",
            "imageUrl": "https://picsum.photos/seed/heritageinn/400/300",
            "title": "Rumah Tua Heritage Inn",
            "description": "A restored Dutch colonial house turned intimate inn with antique furnishings and garden breakfast"
          },
          {
            "itemId": "rec_acc_014",
            "imageUrl": "https://picsum.photos/seed/beachbungalow/400/300",
            "title": "Pantai Bungalow Stay",
            "description": "Beachfront bungalows steps from the shore with hammocks, sea breeze, and stunning sunrises"
          }
        ]
    """.trimIndent()
}