package com.company;

import java.util.Scanner;

//import java.util.Scanner;
public class Diamond {
    public static final String ANSI_GREEN  = "\u001B[32m";
    public static final String ANSI_BG_BLUE = "\u001B[44m";

    /*
    Intro to Bookbinding
    Book Ideation Project
    By Candice Cobb 2014
    */
    public static void main(String[] args) {

        int i, j;
        int r = 7;

        for (i = 0; i <= r; i++)
        {
//Holy cats... I'm only on the first section and I've used all my extra mess up pages already{
            for (j = 1; j <= r-i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*" + "\u001B[32m" + "\u001B[44m");
            System.out.print("\n");
//my god... I'm using crayons on a college project... I may as well give up
/*
2am...better make coffee...
OH COOL MY PAPERS ARE DRY!
I'm gonna dye my own papers like.. always...
This cherry pie is delicious! Oops... crap... do I have enough heavy books to flatten the papers?
 */
        }

        for (i = r - 1; i >= 1; i--)
        {
/*
THIS
TOAST
is on
FIYAHHH!
(dear god I miss home)
 */

            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
//wonder if the 'vette needs covered again...?
//Not to self... don't forget to fix the front cover
//So tired... hate my job right now...can't even write a stream of consciousness...
//fairly certain brain has ceased to function.

/*
...That moment when it's 3am and you're wondering how any emotion you've ever had could possibly be real
because the words in your head aren't nearly as beautiful as the song lyrics you're listening to.

...That other moment when it's 3am and you're realizing that "free rant" and "stream of consciousness" are not only
allowed, but required on a project that people are going to see, and how dangerous that is...
*/
        }

//end diamond shape

/*
Wondering if anyone else finds themselves sad everyday
when they wake up and realize
real life is nothing
like the perfect scenarios you imagine
in your head that kept you
awake all night
 */

/*
technique: mixed media
color: one color
structure: historic (coptic)
image: none
text: stream of consciousness, free write, or rant
layout: centered on page
paper: pre-treated
adjectives: mysterious or coded, transparent, whimsical, complicated or confusing, manifesto-based
media used: drawing pen, acrylic paint, crayon
papers: unryu, lama li lokta, sumi (sumi dyed with food coloring)
 */

    }
}
