# [Platinum V] Rubik's Cube - 6063

[문제 링크](https://www.acmicpc.net/problem/6063)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 372, 정답: 136, 맞힌 사람: 96, 정답 비율: 34.532%

### 분류

구현, 시뮬레이션

### 문제 설명

<p>Rummaging through the stuff of your childhood you find an old toy which you identify as the famous Rubik&#39;s Cube. While playing around with it you have to acknowledge that throughout the years your ability to solve the puzzle has not improved a bit. But because you always wanted to understand the thing and the only other thing you could do right now is to prepare for an exam, you decide to give it a try. Luckily the brother of your girlfriend is an expert and able to fix the cube no matter how messed-up it is. The problem is that he stays with his girlfriend in the Netherlands most of the time, so you need a solution for long-distance learning. You decide to implement a program which is able to document the state of the cube and the turns to be made.&nbsp;</p>

<p>A Rubik&#39;s Cube is covered with 54 square areas called facelets, 9 facelets on each of its six sides. Each facelet has a certain color. Usually when the cube is in its starting state, all facelets belonging to one side have the same color. For the original cube these are red, yellow, green, blue, white and orange.&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6063/1.png" style="height:153px; width:181px" /></p>

<p style="text-align: center;">Figure 1: Turning the front side.</p>

<p>The positions of the facelets can be changed by turning the sides of the cube. This moves nine &quot;little cubes&quot; together with their attached facelets into a new position (see Fig. 1).&nbsp;</p>

<p>The problem is to determine how the facelets of the entire cube are colored after turning different sides in different directions.</p>

### 입력

<p>The first line contains the number of scenarios. Each scenario consists of two sections. The first section describes the starting state of the cube and the second describes the turns to be made.&nbsp;</p>

<p>The starting state describes the colors of the facelets and where they are positioned. The colors are identified by single characters, and one character is given per facelet. Characters are separated by blanks and arranged in a certain pattern (see Fig. 2). The pattern identifies all six sides of the cube and can be thought of as a folding pattern. As shown in Fig. 2, the description of the top side of the cube is placed right over the description of the front side. This is done by indenting the lines with blanks. The next three lines contain the descriptions of the left, front, right and back side as shown in Fig. 2. The descriptions are simply concatenated with a blank character used as separator. After that the description of the bottom side follows, using the same format as the one used to describe the top side. This concludes the description of the starting state.&nbsp;</p>

<p>Then follows the second section of the scenario containing the turns which have to be performed. The description of the turns starts with a line containing the number of turns t (t &gt; 0). Each turn is given in a separate line and consists of two integer values s and d which are separated by a single blank. The first value s determines the side of the cube which has to be turned. The sides are serially numbered as follows:left &#39;0&#39;, front &#39;1&#39;, right &#39;2&#39;, back &#39;3&#39;, top &#39;4&#39;, bottom &#39;5&#39;. The second value d determines in which direction&nbsp;</p>

<p style="text-align: center;"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/6063/2.png" style="height:239px; width:329px" /></p>

<p style="text-align: center;">Figure 2: Folding pattern for input and output</p>

<p>the side s has to be turned and can either be &#39;1&#39; or &#39;-1&#39;. A &#39;1&#39; stands for clockwise and a &#39;-1&#39; for counterclockwise.The direction is given under the assumption that the viewer is looking directly at the specific side of the cube.</p>

### 출력

<p>The output for every scenario begins with a line containing &quot;Scenario #i:&quot;, where i is the number of the scenario starting at 1. After this line print the resulting state of the cube using the same format as the input. Each scenario is terminated by a single blank line.</p>

<p>&nbsp;</p>