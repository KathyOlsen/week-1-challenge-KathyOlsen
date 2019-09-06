import java.util.Scanner;

public class GardenAdventure {
    public static void main(String[] args) {
        String level1 = "";
        String level2 = "";
        String level3 = "";
        String level4 = "";

        Scanner key = new Scanner(System.in);

        System.out.println("Welcome to My Garden! Would you like to enter the Maze, wander the Rose Garden, explore the Vegetable Patch, " +
                "go inside the Greenhouse, or visit the Fountain? (Maze/Rose/Vegetable/Greenhouse/Fountain)");
        level1 = key.next();
        if(level1.equalsIgnoreCase("Maze")){ //  MAZE PATH
            System.out.println("Do you want to go right or left? (Right/Left)");
            level2 = key.next();
            if(level2.equalsIgnoreCase("Right")){
                System.out.println("Ooh! A talking bunny! Do you want to answer its question or run away? (Answer/Run)");
                level3 = key.next();
                if(level3.equalsIgnoreCase("Answer")){
                    System.out.println("What's your favorite color? (Blue/Green)");
                    level4 = key.next();
                    if(level4.equalsIgnoreCase("Blue")){
                        System.out.println("You may pass.  The maze exit is just around the next turn. Enjoy your day!");
                    }else if(level4.equalsIgnoreCase("Green")){
                        System.out.println("Arrrrggghhhhh! The bunny kills you.");
                    }else{
                        System.out.println("Arrrrggghhhhh! Invalid answer. The bunny kills you.");
                    }
                }else if (level3.equalsIgnoreCase("Run")){
                    System.out.println("Run away! Run away! Would you like to keep searching for the Holy Grail or call it a day and go home?" +
                            "(Grail/Home)");
                    level4 = key.next();
                    if(level4.equalsIgnoreCase("Grail")){
                        System.out.println("You get flamed by the dragon guarding the Holy Grail and die.");
                    }else if(level4.equalsIgnoreCase("Home")){
                        System.out.println("Now that's a good idea!  Course it's a good idea! You receive a Garden Adventure bumper sticker on the way out.");
                    }else{
                        System.out.println("Invalid Answer. Remain stuck in the maze forever!");
                    }
                }else{
                    System.out.println("Invalid answer.  The bunny will attack you now!");
                }
            }else if(level2.equalsIgnoreCase("Left")){
                System.out.println("Uh, oh! It's a sphinx! To keep going, you have to answer a riddle. If you get it wrong, " +
                        "she'll attack you. Do you want to keep going? (Yes/No)");
                level3 = key.next();
                if(level3.equalsIgnoreCase("Yes")){
                    System.out.println("What's black and white and red all over? Answer choices: 1) a newspaper or 2) a blushing zebra (Paper/Zebra)");
                    level4 = key.next();
                    if(level4.equalsIgnoreCase("Paper")){
                        System.out.println("Who reads the newspaper these days? The sphinx eats you for lunch.");
                    }else if (level4.equalsIgnoreCase("Zebra")){
                        System.out.println("You may pass. The maze exit is just around the bend. Here's a complimentary Garden Adventure car magnet!");
                    }else{
                        System.out.println("Invalid answer. You're sphinx food!");
                    }
                }else if(level3.equalsIgnoreCase("No")){
                    System.out.println("You take a different fork and find some of the family pets.  Do you want to pet the cat or the dog? (Cat/Dog)");
                    level4 = key.next();
                    if(level4.equalsIgnoreCase("Cat")){
                        System.out.println("Ouch! It bit you.  You survive but have to go to the hospital for a rabies shot.");
                    }else if(level4.equalsIgnoreCase("Dog")){
                        System.out.println("Woof! Fluffy's first two heads like you but his third head eats you!");
                    }else{
                        System.out.println("Invalid answer. You're stuck in my maze forever and a day!");
                    }
                }else{
                    System.out.println("Invalid answer. You get eaten by the sphinx.");
                }
            }else{
                System.out.println("Invalid answer. Now you are fated to haunt these grounds forevermore.");
            }
        }else if(level1.equalsIgnoreCase("Rose")) { //  ROSE GARDEN PATH
            System.out.println("Ooh! Pretty! Do you want to sit on a bench or stroll along the path? (Sit/Stroll)");
            level2 = key.next();
            if (level2.equalsIgnoreCase("Sit")) {
                System.out.println("Would you like to read a book or complain about the heat? (Read/Complain)");
                level3 = key.next();
                if (level3.equalsIgnoreCase("Read")) {
                    System.out.println("I love reading outside, too.  Have a pleasant afternoon?  Here's a complimentary Garden Adventure bookmark!");
                } else if (level3.equalsIgnoreCase("Complain")) {
                    System.out.println("The garden fairy bops you on the head with her poison ivy wand for annoying her and bids you an unpleasant day." +
                            "You survive but with an itchy rash.");
                } else {
                    System.out.println("Invalid answer.  You stumble into the roses and get pricked by thorns.");
                }
            } else if (level2.equalsIgnoreCase("Stroll")) {
                System.out.println("Would you like to stop and smell the roses or pick one? (Smell/Pick");
                level3 = key.next();
                if (level3.equalsIgnoreCase("Smell")) {
                    System.out.println("Don't they smell divine? Here's s complimentary rose-scented soap to take home for your bathroom.");
                } else if (level3.equalsIgnoreCase("Pick")) {
                    System.out.println("Ouch! You just got stung by a bee! You have an allergic reaction and die.");
                } else {
                    System.out.println("Invalid answer. You get chased by a swarm of bees.");
                }
            } else {
                System.out.println("Invalid answer. You return to the parking lot only to find you have a flat tire.");
            }
        }else if(level1.equalsIgnoreCase("Vegetable")) { //  VEGETABLE PATCH PATH
            System.out.println("Please help me out.  Do you pick up the watering can or the hoe? (Can/Hoe)");
            level2 = key.next();
            if (level2.equalsIgnoreCase("Can")) {
                System.out.println("Do you fill the can with water or use it to play catch with my son (Peter is six 6)? (Water/Catch)");
                level3 = key.next();
                if (level3.equalsIgnoreCase("Water")) {
                    System.out.println("It's hot out! Do you pour the water on the plants or yourself? (Plants/Self)");
                    level4 = key.next();
                    if (level4.equalsIgnoreCase("Plants")) {
                        System.out.println("Thank you so much for helping! Here is a basket of free veggies to take home! Enjoy!");
                    } else if (level4.equalsIgnoreCase("Self")) {
                        System.out.println("Well thank you so much for wasting water and making my path muddy. Release the hounds! . . . You survive, your pants don't");
                    } else {
                        System.out.println("Invalid answer.  My attack bunny is coming. Be afraid. Be very afraid!");
                    }
                } else if (level3.equalsIgnoreCase("Catch")) {
                    System.out.println("Do you toss the can gently or go long? (Gently/Long)");
                    level4 = key.next();
                    if (level4.equalsIgnoreCase("Gently")) {
                        System.out.println("Thank you for playing with Peter and not stepping on the plants. Enjoy some lemonade and carrot cookies on the veranda.");
                    } else if (level4.equalsIgnoreCase("Long")) {
                        System.out.println("You've trampled my plants! My vegetable patch is ruined! Release the hounds! . . . You don't survive the mauling.");
                    } else {
                        System.out.println("Invalid Answer. You better run, better run, faster than my attack bunny!");
                    }
                } else {
                    System.out.println("Invalid answer. You get chased by my attack bunny!");
                }
            } else if (level2.equalsIgnoreCase("Hoe")) {
                System.out.println("Do you want to weed the carrots or the beans? (Carrots/Beans)");
                level3 = key.next();
                if (level3.equalsIgnoreCase("Carrots")) {
                    System.out.println("Do you know the difference between a weed and a carrot top? (Yes/No)");
                    level4 = key.next();
                    if (level4.equalsIgnoreCase("Yes")) {
                        System.out.println("Thanks so much for your help. Here's a special Garden Adventure plate of fresh-baked carrot cookies to take home.");
                    } else if (level4.equalsIgnoreCase("No")) {
                        System.out.println("You hacked up all my carrots with the weeds! Release the hounds! . . . You barely survive, after an extended hospital stay.");
                    } else {
                        System.out.println("Invalid answer. My army of moles chase you from the garden.");
                    }
                } else if (level3.equalsIgnoreCase("Beans")) {
                    System.out.println("Ooh! A magic beanstalk! Do you climb it? (Yes/No)");
                    level4 = key.next();
                    if (level4.equalsIgnoreCase("Yes")) {
                        System.out.println("Did you think there was a golden-egg-laying goose at the top? Nope. Just a hungry giant, who eats you.");
                    } else if (level4.equalsIgnoreCase("No")) {
                        System.out.println("Good answer! You don't get eaten by the giant. Here's a tasty black bean brownie to thank you for your help.");
                    } else {
                        System.out.println("Invalid answer. My army of moles chase you from the garden.");
                    }
                } else {
                    System.out.println("Invalid answer. You get turned into a scarecrow.");
                }
            } else {
                System.out.println("Invalid answer. Now you are fated to eat only brussels sprouts forever.");
            }
        }else if(level1.equalsIgnoreCase("Greenhouse")) { //  GREENHOUSE PATH
            System.out.println("Do you take the left aisle or the right aisle? (Left/Right)");
            level2 = key.next();
            if (level2.equalsIgnoreCase("Left")) {
                System.out.println("Aren't the orchids lovely! Do you take a photo or take a plant? (Photo/Plant)");
                level3 = key.next();
                if (level3.equalsIgnoreCase("Photo")) {
                    System.out.println("Photos make great screensavers! Here's a complimentary Garden Adventure trowel!");
                } else if (level3.equalsIgnoreCase("Plant")) {
                    System.out.println("Thief! The greenhouse ghoul permanently turns you into a macabre stone flower pot.");
                } else {
                    System.out.println("Invalid answer.  A mimbulus mimbletonia covers you in stinksap.");
                }
            } else if (level2.equalsIgnoreCase("Right")) {
                System.out.println("Uh, oh! Carnivorous plants! Do you take a photo or move closer to examine it? (Photo/Closer)");
                level3 = key.next();
                if (level3.equalsIgnoreCase("Photo")) {
                    System.out.println("Wow! You caught it eating a fly. I'll silkscreen your photo on a Garden Adventure tee-shirt for you!  That'll be $15.99 on your way out.");
                } else if (level3.equalsIgnoreCase("Closer")) {
                    System.out.println("CHOMP! Nice knowing you.");
                } else {
                    System.out.println("Invalid answer. Better run before the Venus Flytrap gets you.");
                }
            } else {
                System.out.println("Invalid answer. You are swallowed by a giant toad.");
            }
        }else if(level1.equalsIgnoreCase("Fountain")) { //  FOUNTAIN PATH
            System.out.println("Do you sit on a bench by the fountain or climb in? (Bench/In)");
            level2 = key.next();
            if (level2.equalsIgnoreCase("Bench")) {
                System.out.println("Would you like to read a book or eat a snack? (Book/Snack)");
                level3 = key.next();
                if (level3.equalsIgnoreCase("Book")) {
                    System.out.println("Pleasant! Oh, dear, the wind blew water on your book. You and your book survive.");
                } else if (level3.equalsIgnoreCase("Snack")) {
                    System.out.println("Hmm.  The bee likes your snack, too. And now it stung you. Ouch! You survive but your hand hurts for several hours.");
                } else {
                    System.out.println("Invalid answer. A bird poops on your head.");
                }
            } else if (level2.equalsIgnoreCase("In")) {
                System.out.println("Do you just play in the water or climb the statue? (Play/Climb)");
                level3 = key.next();
                if (level3.equalsIgnoreCase("Play")) {
                    System.out.println("You cooled off but eventually you lose your foot to flesh-eating bacteria. You do, however, survive.");
                } else if (level3.equalsIgnoreCase("Climb")) {
                    System.out.println("You slip, crash your head into the fountain rim, and drown.");
                } else {
                    System.out.println("Invalid answer. A flock of pidgeotos chase you from the garden.");
                }
            } else {
                System.out.println("Invalid answer. You get turned into a garden gnome.");
            }
        }else{
            System.out.println("Invalid answer. The flowers' aroma sends you into an eternal sleep.");
        }
    }
}
