package com.example.administrator.movieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

public class ComedyDescription extends AppCompatActivity
{
    private int images[] = {R.drawable.forrestgump, R.drawable.grandbudapest, R.drawable.hotfuzz, R.drawable.johnnyenglish, R.drawable.keanu, R.drawable.kingsman, R.drawable.midnightrunners, R.drawable.montypyton, R.drawable.spy, R.drawable.worldsend, R.drawable.swissarmymen, R.drawable.irongiant, R.drawable.shaunofthedead, R.drawable.airplane, R.drawable.scottpilgrim, R.drawable.kickass, R.drawable.theinterview, R.drawable.pineappleexpress, R.drawable.superbad, R.drawable.dointheshadows };
    private String descriptions[] = {"Forrest Gump is a simple man with a low I.Q. but good intentions. He is running through childhood with his best and only friend Jenny. His 'mama' teaches him the ways of life and leaves him to choose his destiny. Forrest joins the army for service in Vietnam, finding new friends called Dan and Bubba, he wins medals, creates a famous shrimp fishing fleet, inspires people to jog, starts a ping-pong craze, creates the smiley, writes bumper stickers and songs, donates to people and meets the president several times. However, this is all irrelevant to Forrest who can only think of his childhood sweetheart Jenny Curran, who has messed up her life. Although in the end all he wants to prove is that anyone can love anyone.", "GRAND BUDAPEST HOTEL recounts the adventures of Gustave H, a legendary concierge at a famous European hotel between the wars, and Zero Moustafa, the lobby boy who becomes his most trusted friend. The story involves the theft and recovery of a priceless Renaissance painting and the battle for an enormous family fortune -- all against the back-drop of a suddenly and dramatically changing Continent.", "Top London cop, PC Nicholas Angel is good. Too good. And to stop the rest of his team looking bad, he is reassigned to the quiet town of Sandford. He is paired with Danny Butterman, who endlessly questions him on the action lifestyle. Everything seems quiet for Angel, until two actors are found decapitated. It is called an accident, but Angel isn't going to accept that, especially when more and more people turn up dead. Angel and Danny clash with everyone, whilst trying to uncover the truth behind the mystery of the apparent accidents.", "Johnny English is retired in Tibet and in disgrace in MI-7 after a washed up mission in Mozambique. Out of the blue, he is summoned by the MI-7 to stop the Vortex, an agency of skilled assassins that are planning to kill the Chinese premier Xiang Ping. Johnny English is back in action with the support of the rookie Agent Tucker. But he is betrayed by someone that he would never expect.", "Rell's life is changed forever when a cute kitten comes to his door, and he names it Keanu. Unfortunately, one weekend later, Keanu is abducted by persons unknown. Now Rell and his cousin, Clarence, are men on a mission to find Keanu against the odds. Unfortunately, those odds prove to be perilously high as they find Keanu in the care of the ruthless gangster, Cheddar, and he will only part with him for a price. Now for that cute kitten, these two middle class bumblers find themselves neck deep in a dangerous alien world of drugs and gang violence with only their desperate audacity, creativity and sheer dumb luck giving them a chance to survive.", "A spy organization recruits an unrefined, but promising street kid into the agency's ultra-competitive training program, just as a global threat emerges from a twisted tech genius." , "The story is about two Korean National Police University students, Ki-joon (Park Seo-joon) and Hee-yeol (Kang Ha-neul), who witness a kidnapping and track it down.[8] However, the authorities are busy with the kidnapping of a son of a business mogul. They decide to embark on their own amateur investigation, which gets them into all sorts of trouble", "History is turned on its comic head when, in 10th century England, King Arthur travels the countryside to find knights who will join him at the Round Table in Camelot. Gathering up the men is a tale in itself but after a bit of a party at Camelot, many decide to leave only to be stopped by God who sends them on a quest: to find the Holy Grail. After a series of individual adventures, the knights are reunited but must face a wizard named Tim, killer rabbits and lessons in the use of holy hand grenades. Their quest comes to an end however when the police intervene - just what you would expect in a Monty Python movie.", "Susan Cooper is an unassuming, deskbound CIA analyst, and the unsung hero behind the Agency's most dangerous missions. But when her partner falls off the grid and another top agent is compromised, she volunteers to go deep undercover to infiltrate the world of a deadly arms dealer, and prevent a global crisis.", "20 years after attempting an epic pub crawl, five childhood friends reunite when one of them becomes hell bent on trying the drinking marathon again. They are convinced to stage an encore by mate Gary King, a 40-year old man trapped at the cigarette end of his teens, who drags his reluctant pals to their home town and once again attempts to reach the fabled pub, The World's End. As they attempt to reconcile the past and present, they realize the real struggle is for the future, not just theirs but humankind's. Reaching The World's End is the least of their worries","Hank, stranded on a deserted island and about to kill himself, notices a corpse washed up on the beach. He befriends it, naming it Manny, only to discover that his new friend can talk and has a myriad of supernatural abilities...which may help him get home.","This is the story of a nine-year-old boy named Hogarth Hughes who makes friends with an innocent alien giant robot that came from outer space. Meanwhile, a paranoid U.S. Government agent named Kent Mansley arrives in town, determined to destroy the giant at all costs. It's up to Hogarth to protect him by keeping him at Dean McCoppin's place in the junkyard.","Shaun doesn't have a very good day, so he decides to turn his life around by getting his ex to take him back, but he times it for right in the middle of what may be a zombie apocalypse... But for him, it's an opportunity to show everyone he knows how useful he is by saving them all. All he has to do is survive... And get his ex back.", "Still craving for the love of his life, Ted Striker follows Elaine onto the flight that she is working on as a member of the cabin crew. Elaine doesn't want to be with Ted anymore, but when the crew and passengers fall ill from food poisoning, all eyes are on Ted.", "Scott Pilgrim plays in a band which aspires to success. He dates Knives Chau, a high-school girl five years younger, and he hasn't recovered from being dumped by his former girlfriend, now a success with her own band. When Scott falls for Ramona Flowers, he has trouble breaking up with Knives and tries to romance Ramona. As if juggling two women wasn't enough, Ramona comes with baggage: seven ex-lovers, with each of whom Scott must do battle to the death in order to win Ramona.", "In the action-comedy The Interview, Dave Skylark (James Franco) and his producer Aaron Rapoport (Seth Rogen) run the popular celebrity tabloid TV show \"Skylark Tonight.\" When they discover that North Korean dictator Kim Jong-un is a fan of the show, they land an interview with him in an attempt to legitimize themselves as journalists. As Dave and Aaron prepare to travel to Pyongyang, their plans change when the CIA recruits them, perhaps the two least-qualified men imaginable, to assassinate Kim Jong-un.", "Dave Lizewski is an unnoticed high school student and comic book fan with a few friends and who lives alone with his father. His life is not very difficult and his personal trials not that overwhelming. However, one day he makes the simple decision to become a super-hero even though he has no powers or training.", "Lazy court-process clerk and stoner Dale Denton has only one reason to visit his equally lazy dealer Saul Silver: to purchase weed, specifically, a rare new strain called Pineapple Express. But when Dale becomes the only witness to a murder by a crooked cop and the city's most dangerous drug lord, he panics and dumps his roach of Pineapple Express at the scene. Dale now has another reason to visit Saul: to find out if the weed is so rare that it can be traced back to him--and it is. As Dale and Saul run for their lives, they quickly discover that they're not suffering from weed-fueled paranoia: incredibly, the bad guys really are hot on their trail and trying to figure out the fastest way to kill them both. All aboard the Pineapple Express.", "Seth and Evan are best friends, inseparable, navigating the last weeks of high school. Usually shunned by the popular kids, Seth and Evan luck into an invitation to a party, and spend a long day, with the help of their nerdy friend Fogell, trying to score enough alcohol to lubricate the party and inebriate two girls, Jules and Becca, so they can kick-start their sex lives and go off to college with a summer full of experience and new skills. Their quest is complicated by Fogell's falling in with two inept cops who both slow and assist the plan. If they do get the liquor to the party, what then? Is sex the only rite of passage at hand?", "Follow the lives of Viago (Taika Waititi), Deacon (Jonathan Brugh), and Vladislav (Jemaine Clement) - three flatmates who are just trying to get by and overcome life's obstacles-like being immortal vampires who must feast on human blood. Hundreds of years old, the vampires are finding that beyond sunlight catastrophes, hitting the main artery, and not being able to get a sense of their wardrobe without a reflection-modern society has them struggling with the mundane like paying rent, keeping up with the chore wheel, trying to get into nightclubs, and overcoming flatmate conflicts."};
    private int[] ratings = {5, 4, 4, 3, 3, 4, 3, 4, 3, 3, 3, 4, 4, 4, 3, 4, 3, 3, 4, 4};
    private String[] ageRating = {"PG-13", "R", "R", "PG", "R", "R","R", "PG", "R", "R","R","PG", "R", "PG", "PG-13", "R", "R", "R", "R", "R"};
    private String[] runTimes = {"2h 22min", "1h 39min"," 2h 1min", "1h 41min", "1h 40min", "2h 9min", "1h 49min", "1h 31min", "1h 59min", "1h 49min","1h 36min", "1h 26min", "1h 39min", "1h 28min", "1h 52min", "1h 57min", "1h 52min", "1h 51min", "1h 53min", "1h 26min"};
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        int movie = getIntent().getExtras().getInt("chosenMovie");
        if(getIntent().getExtras().getInt("counter") > 0)
        {
            movie = getIntent().getExtras().getInt("differentMovie");
        }

        TextView movieDesc = findViewById(R.id.movieDesc);
        movieDesc.setText(descriptions[movie]);

        TextView runTime = findViewById(R.id.runTime);
        String format = "Runtime:" + " " + runTimes[movie];
        runTime.setText(format);

        TextView rating = findViewById(R.id.rating);
        rating.setText(ageRating[movie]);

        ImageView Poster = findViewById(R.id.Poster);
        Poster.setImageResource(images[movie]);

        RatingBar ratingBar = findViewById(R.id.ratingBar);
        ratingBar.setMax(5);
        ratingBar.setRating(ratings[movie]);
    }
}

