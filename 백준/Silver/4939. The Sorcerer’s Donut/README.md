# [Silver I] The Sorcerer’s Donut - 4939

[문제 링크](https://www.acmicpc.net/problem/4939)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 31, 정답: 21, 맞힌 사람: 21, 정답 비율: 67.742%

### 분류

구현, 자료 구조, 문자열, 브루트포스 알고리즘, 집합과 맵, 해시를 사용한 집합과 맵

### 문제 설명

<p>For each dataset, output the total sum of the blessed time of the endowed programmer. The blessed time of a programmer is the length of his/her stay at the altar during the presence of the goddess. The endowed programmer is the one whose total blessed time is the longest among all the programmers. The output should be represented in minutes. Note that the goddess of programming is not a programmer.aYour master went to the town for a day. You could have a relaxed day without hearing his scolding. But he ordered you to make donuts dough by the evening. Loving donuts so much, he can&rsquo;t live without eating tens of donuts everyday. What a chore for such a beautiful day.</p>

<p>But last week, you overheard a magic spell that your master was using. It was the time to try. You casted the spell on a broomstick sitting on a corner of the kitchen. With a flash of lights, the broom sprouted two arms and two legs, and became alive. You ordered him, then he brought flour from the storage, and started kneading dough. The spell worked, and how fast he kneaded it!</p>

<p>A few minutes later, there was a tall pile of dough on the kitchen table. That was enough for the next week. &ldquo;OK, stop now.&rdquo; You ordered. But he didn&rsquo;t stop. Help! You didn&rsquo;t know the spell to stop him! Soon the kitchen table was filled with hundreds of pieces of dough, and he still worked as fast as he could. If you could not stop him now, you would be choked in the kitchen filled with pieces of dough.</p>

<p>Wait, didn&rsquo;t your master write his spells on his notebooks? You went to his den, and found the notebook that recorded the spell of cessation.</p>

<p>But it was not the end of the story. The spell written in the notebook is not easily read by others. He used a plastic model of a donut as a notebook for recording the spell. He split the surface of the donut-shaped model into square mesh (Figure B.1), and filled with the letters (Figure B.2). He hid the spell so carefully that the pattern on the surface looked meaningless. But you knew that he wrote the pattern so that the spell &ldquo;appears&rdquo; more than once (see the next paragraph for the precise conditions). The spell was not necessarily written in the left-to-right direction, but any of the 8 directions, namely left-to-right, right-to-left, top-down, bottom-up, and the 4 diagonal directions.</p>

<p>You should be able to find the spell as the longest string that appears more than once. Here, a string is considered to appear more than once if there are square sequences having the string on the donut that satisfy the following conditions.</p>

<p>Each square sequence does not overlap itself. (Two square sequences can share some squares.)<br />
The square sequences start from different squares, and/or go to different directions.</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4939/1.png" style="height:209px; width:280px" /></p>

<p style="text-align:center">Figure B.1: The Sorcerer&rsquo;s Donut Before Filled with Letters, Showing the Mesh and 8 Possible Spell Directions</p>

<p style="text-align:center"><img alt="" src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/4939/2.png" style="height:209px; width:277px" /></p>

<p style="text-align:center">Figure B.2: The Sorcerer&rsquo;s Donut After Filled with Letters</p>

<p>Note that a palindrome (i.e., a string that is the same whether you read it backwards or forwards) that satisfies the first condition &ldquo;appears&rdquo; twice.</p>

<p>The pattern on the donut is given as a matrix of letters as follows.</p>

<pre>
ABCD
EFGH
IJKL</pre>

<p>Note that the surface of the donut has no ends; the top and bottom sides, and the left and right sides of the pattern are respectively connected. There can be square sequences longer than both the vertical and horizontal lengths of the pattern. For example, from the letter F in the above pattern, the strings in the longest non-self-overlapping sequences towards the 8 directions are as follows.</p>

<pre>
FGHE
FKDEJCHIBGLA
FJB
FIDGJAHKBELC
FEHG
FALGBIHCJEDK
FBJ
FCLEBKHAJGDI</pre>

<p>Please write a program that finds the magic spell before you will be choked with pieces of donuts dough.</p>

### 입력

<p>The input is a sequence of datasets. Each dataset begins with a line of two integers h and w, which denote the size of the pattern, followed by h lines of w uppercase letters from A to Z, inclusive, which denote the pattern on the donut. You may assume 3 &le; h &le; 10 and 3 &le; w &le; 20.</p>

<p>The end of the input is indicated by a line containing two zeros.</p>

### 출력

<p>For each dataset, output the magic spell. If there is more than one longest string of the same length, the first one in the dictionary order must be the spell. The spell is known to be at least two letters long. When no spell is found, output 0 (zero).</p>