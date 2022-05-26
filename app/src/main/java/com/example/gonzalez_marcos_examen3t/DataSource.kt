package com.example.gonzalez_marcos_examen3t



class DataSource(val titulo:String, val autor:String, val imagen:Int, val descripcion: String) {
}


fun getAll() = mutableListOf(
    DataSource("Abbey Road", "The Beatles", R.drawable.abbeyroad, "It was a very happy record,” said producer George Martin, describing this album in The Beatles Anthology. “I guess it was happy because everybody thought it was going to be the last.” Indeed, Abbey Road — recorded in two months during the summer of 1969 — almost never got made at all. That January, the Beatles were on the verge of a breakup, exhausted and angry with one another after the disastrous sessions for the aborted Get Back LP, later salvaged as Let It Be [see No. 342]. Yet determined to go out with the same glory with which they had ﬁrst entranced the world at the start of the decade, the group reconvened at EMI’s Abbey Road Studios to make their most polished album: a collection of superb songs cut with an attention to reﬁned detail, then segued together (especially on Side Two) with conceptual force. There was no thematic link, other than the Beatles’ unique genius. John Lennon veered from the stormy metal of “I Want You (She’s So Heavy)” to the exquisite vocal sunrise of “Because.” Paul McCartney was saucy (“Oh! Darling”), silly (“Maxwell’s Silver Hammer”), and deliciously bitter (“You Never Give Me Your Money”). George Harrison proved his long-secret worth as a composer with “Something” (later covered by Frank Sinatra) and the folk-pop diamond “Here Comes the Sun,” written in his friend Eric Clapton’s garden after a grim round of business meetings. Lennon, McCartney, and Harrison reputedly sang more three-part harmonies here than on any other Beatles album. That warm feeling — a sense of an increasingly divided band warmly coming together as friends — may be one reason Abbey Road has become the most beloved Beatles album of all time"),
    DataSource("Exile on Main Street", "The Rolling Stones", R.drawable.exileonmainst,  "A dirty whirl of basement blues and punk boogie, the Rolling Stones’ 1972 double LP was, according to Keith Richards, “maybe the best thing we did.” Indeed, inside its deliberately dense squall — Richards’ and Mick Taylor’s dogﬁght riffing, the lusty jump of the Bill Wyman–Charlie Watts rhythm engine, Mick Jagger’s caged-animal bark and burned-soul croon — is the Stones’ greatest album and Jagger and Richards’ deﬁnitive songwriting statement of outlaw pride and dedication to grit and cold-morning redemption.  In the existential shuffle of “Tumbling Dice,” the ­exhausted country beauty of “Torn and Frayed,” and the whiskey-soaked church of “Shine a Light,” you literally hear the Stones in exile: working at Richards’ villa in the South of France, on the run from media censure, British drug police (Jagger and Richards had been busted and arrested before), and the U.K.’s then-onerous tax code. The music rattles with corrosive abandon but also swings with a clear purpose — unconditional survival — in “Rocks Off” and “All Down the Line.” As Richards explained, “The Stones don’t have a home anymore — hence the exile — but they can still keep it together. Whatever people throw at us, we can still duck, improvise, overcome.” Great example: Richards ­recorded his jubilant romp “Happy” with only producer Jimmy Miller on drums and sax man Bobby Keys, while waiting for the other Stones to turn up for work. Exile on Main Street is the band at its ﬁghting best, armed with the blues, playing to win"),
    DataSource("The Velvet Underground", "The Velvet Underground and Nico", R.drawable.velvetunderground,  "We were trying to do a Phil Spector thing with as few instruments as possible,” John Cale, the classically trained pianist and viola player of the Velvet Underground, once said of this record. It was no idle boast. Much of what we take for granted in rock would not exist without this New York band or its seminal debut: the androgynous sexuality of glitter, punk’s raw noir, the blackened-riff howl of grunge and noise rock. It is a record of fearless breadth and lyrical depth. Singer-songwriter Lou Reed documented carnal desire and drug addiction with a pop wisdom he learned as a song-factory composer for Pickwick Records. Cale introduced the power of pulse and drone (from his work in early minimalism); guitarist Sterling Morrison and drummer Maureen Tucker played with tribal force; Nico, a German vocalist brieﬂy added to the band by manager Andy Warhol, brought an icy femininity to the heated ennui in Reed’s songs. Rejected as nihilistic by the love crowd in 1967, the Banana Album (so named for its Warhol-designed cover), is the most prophetic rock album ever made"),
    DataSource("Are You Experienced", "Jimi Hendrix", R.drawable.areyouexperienced,"This is what Britain sounded like in late 1966 and early 1967: ablaze with rainbow blues, orchestral guitar feedback, and cosmic possibility. Jimi Hendrix’s incendiary guitar was historic in itself, the luminescent sum of his chitlin-circuit labors with Little Richard and the Isley Brothers and his melodic exploitation of amp howl. But it was the pictorial heat of songs like “Manic Depression” and “The Wind Cries Mary” that established the transcendent promise of psychedelia. Backed by drummer Mitch Mitchell and bassist Noel Redding, the guitarist made soul music for inner space. “It’s a collection of free feeling and imagination,” he said of the album. “Imagination is very important.” Widely assumed to be about an acid trip, “Purple Haze” had “nothing to do with drugs,” Hendrix insisted. “‘Purple Haze’ was all about a dream I had that I was walking under the sea."),
    DataSource("Back in Black", "AC/DC", R.drawable.backinblack,"In the middle of album rehearsals, singer Bon Scott went on a drinking spree; he choked on his vomit and was found dead in the back seat of a car. After two days of mourning, guitarist Malcolm Young thought, “Well, fuck this, I’m not gonna sit around mopin’ all fuckin’ year.” He called his brother, guitarist Angus Young, and they went back to work with replacement vocalist Brian Johnson. The resulting album has the relentless logic of a sledgehammer. Back in Black remains the purest distillation of hard rock: “Hells Bells,” “You Shook Me All Night Long,” and the title track have all become enduring anthems of strutting blues-based guitar"),
    DataSource("Appetite for Destruction","Guns N' Roses",R.drawable.appetitefordestruction, "The biggest-selling debut album of the Eighties, Appetite hit the metal scene like an asteroid, bringing the grit and fury of Seventies rock back to a mainstream hard-rock scene that was starved for something real. Indiana-bred Axl Rose’s five-alarm yowl bowled over listeners. Guitarist Slash gave the band blues emotion and punk energy, while the rhythm section brought the funk on hits such as “Welcome to the Jungle.” When all the elements came together, as in the final two minutes of “Paradise City,” GN’R left all other Eighties metal bands in the dust, and they knew it, too. “A lot of rock bands are too fucking wimpy to have any sentiment or any emotion,” Rose said. “Unless they’re in pain."),
    DataSource("Led Zeppelin IV", "Led Zeppelin", R.drawable.ledzeppeliniv,   "I put a lot of work into my lyrics,” Robert Plant told Rolling Stone in 1975. “Not all my stuff is meant to be scrutinized, though. Things like ‘Black Dog’ are blatant let’s-do-it-in-the-bath-type things, but they make their point just the same.” On their towering rune-titled fourth album, Led Zeppelin matched the raunch of “Black Dog” with Plant’s most poetic lyrics on the inescapable epic ballad “Stairway to Heaven,” while guitarist Jimmy Page veers from the blues apocalypse of “When the Levee Breaks” to the mandolin-driven “Battle of Evermore.” (“It sounded like a dance-around-the-maypole number,” Page later confessed."),
    DataSource("Lady Soul", "Aretha Franklin", R.drawable.ladysoul,"Aretha Franklin’s third Atlantic album in less than two years is another classic, with “(You Make Me Feel Like) A Natural Woman,” “Ain’t No Way,” and a slinky version of the Rascals’ “Groovin’.” It was a year of triumph and turbulence for Franklin: Although she made the cover of Time, the magazine reported details of her rocky marriage to Ted White, then her manager. But Franklin channeled that frenzy into performances of funky pride and magisterial hurt. Among the best: the grand-prayer treatment of Curtis Mayfield’s “People Get Ready” and her explosive anguish on the hit “Chain of Fools."),
    DataSource("I Never Loved a Man the Way I Love You", "Aretha Franklin", R.drawable.neverloved, "Aretha Franklin’s Atlantic debut is the place where gospel music collided with R&B and rock & roll and became soul. The Detroit-born preacher’s daughter was about $80,000 in debt to her previous label, Columbia, when Atlantic producer Jerry Wexler signed her in 1966. “I took her to church,” Wexler said, “sat her down at the piano, and let her be herself.”  Recording with the best session men at FAME Studios in Muscle Shoals, Alabama, she promptly cut the album’s title hit, a slow-fire ballad of ferocious sexuality. The historic moment, of course, was her storefront-church makeover of Otis Redding’s “Respect,” which became Franklin’s first Number One pop single, prompting Redding to exclaim, “I just lost my song.” Soon, it would be the new marching anthem of the women’s and civil rights movements. “Women did, and still do, need equal rights,” Franklin said decades later. “We’re doing the same job, we expect the same pay, and the same respect.” She reinforced that feminism on “Do Right Woman, Do Right Man” and had the guts to wring more pathos from Sam Cooke’s civil rights anthem, “A Change Is Gonna Come,” than any other singer who has attempted that landmark song. Never Loved a Man began an unparalleled run of classic albums for Franklin; it’s the sound of the Queen of Soul claiming her crown."),
    DataSource("What's Going On", "Marvin Gaye", R.drawable.whatsgoingon,  "Marvin Gaye’s masterpiece began as a reaction to police brutality. In May 1969, Renaldo “Obie” Benson, the Four Tops’ bass singer, watched TV coverage of hundreds of club-wielding cops breaking up the People’s Park, a protest hub in Berkeley. Aghast at the violence, Benson began to write a song with Motown lyricist Al Cleveland, trying to capture the confusion and pain of the times. He knew he had something big in his nascent version of “What’s Going On,” but the rest of the Four Tops weren’t interested, and Benson’s efforts to get Joan Baez to record it didn’t work out, either.  But one of Motown’s biggest stars and greatest voices turned out to be more receptive. Gaye was in a dark and contemplative place, wounded by the death of his frequent duet partner Tammi Terrell, yearning to sing subtler and more substantive material, and mulling over his brother Frankie’s horrifying tales of his recent stint fighting in Vietnam. Gaye had been keeping busy writing for and producing a group called the Originals, and trying to figure out what was next. “I’d been stumbling around for an idea,” he told biographer David Ritz. “I knew there was more inside me. And that was something no record executive or producer could see. But I saw it. I knew I had to get out there.”  After some hesitation, Gaye embraced “What’s Going On,” and with the help of arranger David Van De Pitte, crafted a version of the song that was jazzier and more sophisticated than any Motown recording to date, layering cinematic strings over James Jamerson’s supernaturally sinuous bass line and a polyrhythmic groove. Gaye unleashed one of his most spectacular vocal performances in a career full of them, scatting and improvising around the main melody.  Motown Records founder Berry Gordy initially resisted releasing “What’s Going On,” telling Gaye that he thought scatting was out of date and protest lyrics were too commercially risky. But when the song became an instant hit, Gordy gave Gaye a single month to craft an album to accompany “What’s Going On.” Gaye more than rose to the challenge. “I work best under pressure and when I’m depressed,” he told the Detroit Free Press at the time. “The world’s never been as depressing as it is right now. We’re killing the planet, killing our young men in the streets, and going to war around the world. Human rights … that’s the theme.”  What emerged was soul music’s first concept album, and one of the most important and influential LPs ever made. John Legend recently described it as “the voice of black America speaking out that we couldn’t always smile on cue for you.” Building it all around one finished song lent What’s Going On a musical and thematic through line. “What’s Happening Brother” assumes the voice of a Vietnam vet like Gaye’s brother, puzzled by a changing America and looking for work; “Mercy Mercy Me (The Ecology)” is a taut ode to the environment; “Flyin’ High (In the Friendly Sky)” takes on drug addiction.  After What’s Going On, black musicians at Motown and elsewhere felt a new freedom to push the musical and political boundaries of their art. “When I was struggling for the right of the Motown artist to express himself,” Gaye said, “Stevie [Wonder] knew I was also struggling for him.”  At the end of the final song on What’s Going On, the lament “Inner City Blues (Make Me Wanna Holler),” the music shifts back into a jazzier reprise of the title track. As the album fades out, the groove continues on. Five decades later, it still hasn’t stopped."),
    DataSource("Kind of Blue", "Miles Davis", R.drawable.kindofblue, "This painterly masterpiece is one of the most important, inﬂuential, and popular albums in jazz. At the time it was made, Kind of Blue was also a revolution all its own. Turning his back on standard chord progressions, trumpeter Miles Davis used modal scales as a starting point for composition and improvisation — breaking new ground with warmth, subtlety, and understatement in the thick of hard bop. Davis and his peerless band — bassist Paul Chambers, drummer Jimmy Cobb, pianist Bill Evans, and the titanic sax team of John Coltrane and Cannonball Adderley — soloed in uncluttered settings, typiﬁed by “melodic rather than harmonic variation,” as Davis put it. Two numbers, “All Blues” and “Freddie Freeloader” (the latter featuring Wynton Kelly at the ivories in place of Evans), are in 12-bar form, but Davis’ approach allowed his players a cool, new, collected freedom."),
    DataSource("Bitches Brew", "Miles Davis", R.drawable.bitchesbrew, "In February 1969, Miles Davis recorded In a Silent Way, a bold step into ambient funk and electric futurism. Then just six months later, he was back in the studio, driven by his desire to assemble “the best damn rock & roll band in the world.” The idea was to connect his music to the audience of Jimi Hendrix and Sly Stone. The result was this double album of jazz-rock fusion, cut in three days of on-the-spot improvisations with an electric orchestra that included three keyboardists, three drummers, two bassists, saxophonist Wayne Shorter, and guitarist John McLaughlin. The music was full of visceral thrills and the brooding darkness Davis brought to everything he touched."),
    DataSource("A Love Supreme", "John Coltrane", R.drawable.alovesupreme, "Two important things happened to John Coltrane in 1957: The saxophonist left Miles Davis’ employ to join Thelonious Monk’s band and hit new heights in extended, ecstatic soloing. Coltrane also kicked his heroin addiction, a vital step in a religious awakening that climaxed with this legendary album-long hymn of praise. The indelible four-note theme of the first movement, “Acknowledgment,” is the humble foundation of the suite. But Coltrane’s majestic, often violent blowing (famously described as “sheets of sound”) is never self-aggrandizing. Coltrane soars with nothing but gratitude and joy. You can’t help but go with him.")

)


fun getRock() = mutableListOf(
   DataSource("Abbey Road", "The Beatles", R.drawable.abbeyroad, "It was a very happy record,” said producer George Martin, describing this album in The Beatles Anthology. “I guess it was happy because everybody thought it was going to be the last.” Indeed, Abbey Road — recorded in two months during the summer of 1969 — almost never got made at all. That January, the Beatles were on the verge of a breakup, exhausted and angry with one another after the disastrous sessions for the aborted Get Back LP, later salvaged as Let It Be [see No. 342]. Yet determined to go out with the same glory with which they had ﬁrst entranced the world at the start of the decade, the group reconvened at EMI’s Abbey Road Studios to make their most polished album: a collection of superb songs cut with an attention to reﬁned detail, then segued together (especially on Side Two) with conceptual force. There was no thematic link, other than the Beatles’ unique genius. John Lennon veered from the stormy metal of “I Want You (She’s So Heavy)” to the exquisite vocal sunrise of “Because.” Paul McCartney was saucy (“Oh! Darling”), silly (“Maxwell’s Silver Hammer”), and deliciously bitter (“You Never Give Me Your Money”). George Harrison proved his long-secret worth as a composer with “Something” (later covered by Frank Sinatra) and the folk-pop diamond “Here Comes the Sun,” written in his friend Eric Clapton’s garden after a grim round of business meetings. Lennon, McCartney, and Harrison reputedly sang more three-part harmonies here than on any other Beatles album. That warm feeling — a sense of an increasingly divided band warmly coming together as friends — may be one reason Abbey Road has become the most beloved Beatles album of all time"),
   DataSource("Exile on Main Street", "The Rolling Stones", R.drawable.exileonmainst,"A dirty whirl of basement blues and punk boogie, the Rolling Stones’ 1972 double LP was, according to Keith Richards, “maybe the best thing we did.” Indeed, inside its deliberately dense squall — Richards’ and Mick Taylor’s dogﬁght riffing, the lusty jump of the Bill Wyman–Charlie Watts rhythm engine, Mick Jagger’s caged-animal bark and burned-soul croon — is the Stones’ greatest album and Jagger and Richards’ deﬁnitive songwriting statement of outlaw pride and dedication to grit and cold-morning redemption.  In the existential shuffle of “Tumbling Dice,” the ­exhausted country beauty of “Torn and Frayed,” and the whiskey-soaked church of “Shine a Light,” you literally hear the Stones in exile: working at Richards’ villa in the South of France, on the run from media censure, British drug police (Jagger and Richards had been busted and arrested before), and the U.K.’s then-onerous tax code. The music rattles with corrosive abandon but also swings with a clear purpose — unconditional survival — in “Rocks Off” and “All Down the Line.” As Richards explained, “The Stones don’t have a home anymore — hence the exile — but they can still keep it together. Whatever people throw at us, we can still duck, improvise, overcome.” Great example: Richards ­recorded his jubilant romp “Happy” with only producer Jimmy Miller on drums and sax man Bobby Keys, while waiting for the other Stones to turn up for work. Exile on Main Street is the band at its ﬁghting best, armed with the blues, playing to win."),
   DataSource("The Velvet Underground", "The Velvet Underground and Nico", R.drawable.velvetunderground,  "We were trying to do a Phil Spector thing with as few instruments as possible,” John Cale, the classically trained pianist and viola player of the Velvet Underground, once said of this record. It was no idle boast. Much of what we take for granted in rock would not exist without this New York band or its seminal debut: the androgynous sexuality of glitter, punk’s raw noir, the blackened-riff howl of grunge and noise rock. It is a record of fearless breadth and lyrical depth. Singer-songwriter Lou Reed documented carnal desire and drug addiction with a pop wisdom he learned as a song-factory composer for Pickwick Records. Cale introduced the power of pulse and drone (from his work in early minimalism); guitarist Sterling Morrison and drummer Maureen Tucker played with tribal force; Nico, a German vocalist brieﬂy added to the band by manager Andy Warhol, brought an icy femininity to the heated ennui in Reed’s songs. Rejected as nihilistic by the love crowd in 1967, the Banana Album (so named for its Warhol-designed cover), is the most prophetic rock album ever made"),
   DataSource("Are You Experienced", "Jimi Hendrix", R.drawable.areyouexperienced,"This is what Britain sounded like in late 1966 and early 1967: ablaze with rainbow blues, orchestral guitar feedback, and cosmic possibility. Jimi Hendrix’s incendiary guitar was historic in itself, the luminescent sum of his chitlin-circuit labors with Little Richard and the Isley Brothers and his melodic exploitation of amp howl. But it was the pictorial heat of songs like “Manic Depression” and “The Wind Cries Mary” that established the transcendent promise of psychedelia. Backed by drummer Mitch Mitchell and bassist Noel Redding, the guitarist made soul music for inner space. “It’s a collection of free feeling and imagination,” he said of the album. “Imagination is very important.” Widely assumed to be about an acid trip, “Purple Haze” had “nothing to do with drugs,” Hendrix insisted. “‘Purple Haze’ was all about a dream I had that I was walking under the sea."),
   DataSource("Back in Black", "AC/DC", R.drawable.backinblack,"In the middle of album rehearsals, singer Bon Scott went on a drinking spree; he choked on his vomit and was found dead in the back seat of a car. After two days of mourning, guitarist Malcolm Young thought, “Well, fuck this, I’m not gonna sit around mopin’ all fuckin’ year.” He called his brother, guitarist Angus Young, and they went back to work with replacement vocalist Brian Johnson. The resulting album has the relentless logic of a sledgehammer. Back in Black remains the purest distillation of hard rock: “Hells Bells,” “You Shook Me All Night Long,” and the title track have all become enduring anthems of strutting blues-based guitar"),
   DataSource("Appetite for Destruction","Guns N' Roses",R.drawable.appetitefordestruction, "The biggest-selling debut album of the Eighties, Appetite hit the metal scene like an asteroid, bringing the grit and fury of Seventies rock back to a mainstream hard-rock scene that was starved for something real. Indiana-bred Axl Rose’s five-alarm yowl bowled over listeners. Guitarist Slash gave the band blues emotion and punk energy, while the rhythm section brought the funk on hits such as “Welcome to the Jungle.” When all the elements came together, as in the final two minutes of “Paradise City,” GN’R left all other Eighties metal bands in the dust, and they knew it, too. “A lot of rock bands are too fucking wimpy to have any sentiment or any emotion,” Rose said. “Unless they’re in pain."),
   DataSource("Led Zeppelin IV", "Led Zeppelin", R.drawable.ledzeppeliniv,   "I put a lot of work into my lyrics,” Robert Plant told Rolling Stone in 1975. “Not all my stuff is meant to be scrutinized, though. Things like ‘Black Dog’ are blatant let’s-do-it-in-the-bath-type things, but they make their point just the same.” On their towering rune-titled fourth album, Led Zeppelin matched the raunch of “Black Dog” with Plant’s most poetic lyrics on the inescapable epic ballad “Stairway to Heaven,” while guitarist Jimmy Page veers from the blues apocalypse of “When the Levee Breaks” to the mandolin-driven “Battle of Evermore.” (“It sounded like a dance-around-the-maypole number,” Page later confessed.")
)

fun getBlues() = mutableListOf(
    DataSource("Lady Soul", "Aretha Franklin", R.drawable.ladysoul,"Aretha Franklin’s third Atlantic album in less than two years is another classic, with “(You Make Me Feel Like) A Natural Woman,” “Ain’t No Way,” and a slinky version of the Rascals’ “Groovin’.” It was a year of triumph and turbulence for Franklin: Although she made the cover of Time, the magazine reported details of her rocky marriage to Ted White, then her manager. But Franklin channeled that frenzy into performances of funky pride and magisterial hurt. Among the best: the grand-prayer treatment of Curtis Mayfield’s “People Get Ready” and her explosive anguish on the hit “Chain of Fools."),
    DataSource("I Never Loved a Man the Way I Love You", "Aretha Franklin", R.drawable.neverloved, "Aretha Franklin’s Atlantic debut is the place where gospel music collided with R&B and rock & roll and became soul. The Detroit-born preacher’s daughter was about $80,000 in debt to her previous label, Columbia, when Atlantic producer Jerry Wexler signed her in 1966. “I took her to church,” Wexler said, “sat her down at the piano, and let her be herself.”  Recording with the best session men at FAME Studios in Muscle Shoals, Alabama, she promptly cut the album’s title hit, a slow-fire ballad of ferocious sexuality. The historic moment, of course, was her storefront-church makeover of Otis Redding’s “Respect,” which became Franklin’s first Number One pop single, prompting Redding to exclaim, “I just lost my song.” Soon, it would be the new marching anthem of the women’s and civil rights movements. “Women did, and still do, need equal rights,” Franklin said decades later. “We’re doing the same job, we expect the same pay, and the same respect.” She reinforced that feminism on “Do Right Woman, Do Right Man” and had the guts to wring more pathos from Sam Cooke’s civil rights anthem, “A Change Is Gonna Come,” than any other singer who has attempted that landmark song. Never Loved a Man began an unparalleled run of classic albums for Franklin; it’s the sound of the Queen of Soul claiming her crown."),
    DataSource("What's Going On", "Marvin Gaye", R.drawable.whatsgoingon,  "Marvin Gaye’s masterpiece began as a reaction to police brutality. In May 1969, Renaldo “Obie” Benson, the Four Tops’ bass singer, watched TV coverage of hundreds of club-wielding cops breaking up the People’s Park, a protest hub in Berkeley. Aghast at the violence, Benson began to write a song with Motown lyricist Al Cleveland, trying to capture the confusion and pain of the times. He knew he had something big in his nascent version of “What’s Going On,” but the rest of the Four Tops weren’t interested, and Benson’s efforts to get Joan Baez to record it didn’t work out, either.  But one of Motown’s biggest stars and greatest voices turned out to be more receptive. Gaye was in a dark and contemplative place, wounded by the death of his frequent duet partner Tammi Terrell, yearning to sing subtler and more substantive material, and mulling over his brother Frankie’s horrifying tales of his recent stint fighting in Vietnam. Gaye had been keeping busy writing for and producing a group called the Originals, and trying to figure out what was next. “I’d been stumbling around for an idea,” he told biographer David Ritz. “I knew there was more inside me. And that was something no record executive or producer could see. But I saw it. I knew I had to get out there.”  After some hesitation, Gaye embraced “What’s Going On,” and with the help of arranger David Van De Pitte, crafted a version of the song that was jazzier and more sophisticated than any Motown recording to date, layering cinematic strings over James Jamerson’s supernaturally sinuous bass line and a polyrhythmic groove. Gaye unleashed one of his most spectacular vocal performances in a career full of them, scatting and improvising around the main melody.  Motown Records founder Berry Gordy initially resisted releasing “What’s Going On,” telling Gaye that he thought scatting was out of date and protest lyrics were too commercially risky. But when the song became an instant hit, Gordy gave Gaye a single month to craft an album to accompany “What’s Going On.” Gaye more than rose to the challenge. “I work best under pressure and when I’m depressed,” he told the Detroit Free Press at the time. “The world’s never been as depressing as it is right now. We’re killing the planet, killing our young men in the streets, and going to war around the world. Human rights … that’s the theme.”  What emerged was soul music’s first concept album, and one of the most important and influential LPs ever made. John Legend recently described it as “the voice of black America speaking out that we couldn’t always smile on cue for you.” Building it all around one finished song lent What’s Going On a musical and thematic through line. “What’s Happening Brother” assumes the voice of a Vietnam vet like Gaye’s brother, puzzled by a changing America and looking for work; “Mercy Mercy Me (The Ecology)” is a taut ode to the environment; “Flyin’ High (In the Friendly Sky)” takes on drug addiction.  After What’s Going On, black musicians at Motown and elsewhere felt a new freedom to push the musical and political boundaries of their art. “When I was struggling for the right of the Motown artist to express himself,” Gaye said, “Stevie [Wonder] knew I was also struggling for him.”  At the end of the final song on What’s Going On, the lament “Inner City Blues (Make Me Wanna Holler),” the music shifts back into a jazzier reprise of the title track. As the album fades out, the groove continues on. Five decades later, it still hasn’t stopped.")
)

fun getJazz() = mutableListOf(
    DataSource("Kind of Blue", "Miles Davis", R.drawable.kindofblue, "This painterly masterpiece is one of the most important, inﬂuential, and popular albums in jazz. At the time it was made, Kind of Blue was also a revolution all its own. Turning his back on standard chord progressions, trumpeter Miles Davis used modal scales as a starting point for composition and improvisation — breaking new ground with warmth, subtlety, and understatement in the thick of hard bop. Davis and his peerless band — bassist Paul Chambers, drummer Jimmy Cobb, pianist Bill Evans, and the titanic sax team of John Coltrane and Cannonball Adderley — soloed in uncluttered settings, typiﬁed by “melodic rather than harmonic variation,” as Davis put it. Two numbers, “All Blues” and “Freddie Freeloader” (the latter featuring Wynton Kelly at the ivories in place of Evans), are in 12-bar form, but Davis’ approach allowed his players a cool, new, collected freedom."),
    DataSource("Bitches Brew", "Miles Davis", R.drawable.bitchesbrew, "In February 1969, Miles Davis recorded In a Silent Way, a bold step into ambient funk and electric futurism. Then just six months later, he was back in the studio, driven by his desire to assemble “the best damn rock & roll band in the world.” The idea was to connect his music to the audience of Jimi Hendrix and Sly Stone. The result was this double album of jazz-rock fusion, cut in three days of on-the-spot improvisations with an electric orchestra that included three keyboardists, three drummers, two bassists, saxophonist Wayne Shorter, and guitarist John McLaughlin. The music was full of visceral thrills and the brooding darkness Davis brought to everything he touched."),
    DataSource("A Love Supreme", "John Coltrane", R.drawable.alovesupreme, "Two important things happened to John Coltrane in 1957: The saxophonist left Miles Davis’ employ to join Thelonious Monk’s band and hit new heights in extended, ecstatic soloing. Coltrane also kicked his heroin addiction, a vital step in a religious awakening that climaxed with this legendary album-long hymn of praise. The indelible four-note theme of the first movement, “Acknowledgment,” is the humble foundation of the suite. But Coltrane’s majestic, often violent blowing (famously described as “sheets of sound”) is never self-aggrandizing. Coltrane soars with nothing but gratitude and joy. You can’t help but go with him.")
)







