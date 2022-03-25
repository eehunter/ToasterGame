package scenes

import Characters.Alex
import Characters.Chris
import Characters.Eclipse
import Hide
import Narrator
import Scene
import Show
import SpriteID.Companion.normal
import Transitions.center
import Transitions.fadeIn
import Transitions.fadeOut
import Transitions.left
import Transitions.move
import Transitions.right
import Transitions.transition
import and
import at
import with

object Opening {init{
    Scene("Start"){
        Show scene "#000" with fadeIn
        +"September 25th, 2020. That was the day it happened."
        +"That was the day that the first <i>actual</i> alien civilization made contact with earth."
        +"I was on my computer at the time, working on an assignment for one of my classes, when I heard a rumbling from outside."
        +"It started fairly quiet, barely even audible, but quickly grew to a deafening roar that made my workstation noticeably vibrate."
        +"Thinking it was an earthquake, I ran downstairs and headed for the back door. The field behind my house would be much safer than a building during an earthquake."
        +"I stopped halfway from the stairs to my door. Outside my window, I could now see a metal cylinder slowly descending to the ground, a jet of blue fire below it."
        +"My first thought was that a SpaceX prototype had ended up off course. The idea that a secret government project had done the same also crossed my mind."
        +"The thing soon landed, and the shaking stopped. It was hard to see from that distance, but it looked like a metal staircase unfolded from the craft."
        +"Five figures emerged one by one and descended to the ground below."
        +"I squinted to get a better look at them. I couldn't make out any details, but they all seemed to be wearing brightly colored uniforms."
        +"Different colors too. There was no apparent rhyme or reason to it."
        +"They then began walking toward my house. I couldn't blame them. If I were an astronaut whose vehicle landed in the middle of nowhere, I'd probably walk toward the nearest sign of civilization too."
        +"As they grew closer, however, I became progressively more confused."
        +"(What kind of astronaut would wear a <i>fursuit</i> to <i>space</i>?)"
        +"The situation seemed to be getting stranger and stranger with every passing second."
        +"Whatever kind of thing these strangers were wearing, they <i>really</i> looked like actual protogens."
        +"I must have zoned out for a minute while trying to process what I was seeing, because I then heard a knock on the door."
        // play knock sound, switch to door background
        +"Cautiously I opened it, my mind too busy to think about what I would say to the stranger I was about to greet."
        // play Alex door CG, change music?
        Show character Alex-normal
        +"I stared blankly for a moment at the being before me before I remembered how to speak."
        Chris says "You're a protogen. Like, an <i>actual</i> protogen."
        +"I continued to gape, dumbfounded."
        +"The thing in front of me stared back at me, evidently not comprehending my words. It made a noise that sounded like a string of beeps at various tones."
        +"Faster than I could react, it reached out an gently tapped my arm with the tip of one of its claws."
        +"I felt something like a static shock and recoiled."
        Chris says "What the-"
        Alex says "Hello Chris!"
        Chris says "How do you know my name?"
        Alex says "The translation spell I just cast uses-"
        Chris says "Hold on, <i>spell</i>? How do-? What? Do you use arcite or something?"
        Alex says "You mean Arcanium? I'm a mage, so yeah."
        Chris says "Ok, let me get this straight. Alex, you're a- Wait, how do <i>I</i> know <i>your</i> name!?"
        // show Alex confused
        +"The protogen actually looked puzzled."
        Alex says "That... I actually don't know. I guess the spell must have... Yeah, I have no idea. Magic is weird sometimes."
        +"Up to this point, the situation had felt kind of surreal. I was so busy trying to process what I was seeing that I didn't take the time to think about what was going on."
        +"Now I was starting to question my sanity. The thought that it might be some kind of dream, but it felt too real for that. Then again, dreams of that variety often felt real as they happened."
        +"Still, hallucination seemed more plausible."
        +"At that point, I figured it was just better to play along as if all this was real. Even if it wasn't it would be a fun story to retell, assuming I remembered it. I could even animate it."
        +"If this was all in my imagination, I realized, that would explain how I knew Alex's name."
        Alex says "I should probably introduce you to the others."
        +"I heard another string of beeps, after which a second protogen came up the back step next to him."
        Show character Alex-normal
        Show character Alex-normal at right with move and transition["2s"]
        Show character Eclipse-normal at left with fadeIn
        +"They reached out to one another as if to shake hands."
        // CG here, maybe? Having too many might take a while
        +"There was a brief flash of blue light, before the two protogens turned back to me."
        Alex says "This is Eclipse. She's our lead researcher."
        Alex says "I'm gonna go give the others my translation mappings. Talk to Eclipse if you have any questions."
        +"Even after I decided to just play along, I was still having a hard time processing what was happening."
        Hide character Alex with fadeOut
        Show character Eclipse-normal at center with move and transition["2s"]
        +"Alex left and headed toward the three remaining protogens who stood a distance away."
        +"It took a moment for me to react. I then turned to Eclipse."
        Chris says "So you're a researcher? What are you studying?"
        Eclipse says "Humans, of course. This is our first contact with sapient life outside our own kind."
        +"Perhaps it is worth mentioning that this was happening just after my last class of the day, after I had stayed up abnormally late the last few nights, and then gotten up early to attend an online class."
        +"Having only gotten four hours of sleep a night for the last five days definitely wasn't helping me function."
        +"There was an awkward silence for a moment, before Alex came back."
        Show character Alex-normal at right with fadeIn

    }

} }












