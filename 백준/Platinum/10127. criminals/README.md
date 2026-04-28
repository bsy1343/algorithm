# [Platinum II] criminals - 10127

[문제 링크](https://www.acmicpc.net/problem/10127)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 142, 정답: 44, 맞힌 사람: 38, 정답 비율: 30.159%

### 분류

다이나믹 프로그래밍, 그리디 알고리즘, 방향 비순환 그래프

### 문제 설명

<p>Byteburg is a beautiful town by a river. There are n houses along the river, numbered downstream with successive integers from 1 to n. Byteburg used to be a nice quiet town in which everyone was happy. Alas, this changed recently, as two dangerous criminals - Bitie and Bytie set up shop in it. They did so many robberies already that the citizens are afraid to leave their houses.</p>

<p>Bitie and Bytie do no mere burglaries but rather whole raids: each time they leave their houses and walk towards each other, never turning back. Bitie walks downstream (towards larger numbers) while Bytie walks upstream (towards smaller numbers). Along the way, before they meet, each chooses several houses to break into and steal precious items (and vital data). After the robberies they meet in a house and divide their loot. Byteburgers are sick of this already - they would all rather have their tranquility restored. So they asked the detective Bythony for help.</p>

<p>The detective established that the bandits live in houses of the same color but he does not know which one. Just a moment ago, an anonymous tip claimed that the robbers are on a raid. Fearing for their own safety, the source did not say which houses will be broken into. They did however specify their colors. As it turns out, the bandits are quite superstitious - each of them will rob a house of each color at most once.</p>

<p>Bythony can wait no longer. He intends to ambush the criminals at their meeting place. Aid Bythony in his undertaking by writing a program to find all possible meeting places of the robbers.</p>

### 입력

<p>There are two integers in the first line of the standard input, n and k(3 &le; n &le; 1,000,000, 1 &le; k &le; 1,000,000, k &le; n), separated by a single space, that specify the number of houses and the number of house colors in Byteburg respectively. The colors are number with successive integers from 1 to k. In the second line of input, there is a sequence of n integers, c<sub>1</sub>,c<sub>2</sub>,&hellip;,c<sub>n</sub>(1 &le; c<sub>i</sub> &le; k), separated by single spaces. These are the colors of successive houses in Byteburg.</p>

<p>In the third line of input, there are two integers m and l(1 &le; m,l &le; n, m+l &le; n-1), separated by a single space, specifying the numbers of houses (to be) broken into by Bitie and Bytie respectively. In the fourth line of input, there are m pairwise different integers x<sub>1</sub>,x<sub>2</sub>,&hellip;,x<sub>m</sub>(1 &le; x<sub>i</sub> &le; k), separated by single spaces. These are the colors of houses robbed by Bitie in the order of being broken into (i.e., excluding Bitie&#39;s house). In the fifth, which is the last, line of input, there are l pairwise different integers &nbsp;y<sub>1</sub>,y<sub>2</sub>,&hellip;,y<sub>l</sub>(1 &le; y<sub>i </sub>&le; k), separated by single spaces. These are the colors of houses robbed by Bytie in the order of being broken into (again, these do not include Bytie&#39;s house). Moreover, x<sub>m</sub>=y<sub>l</sub> is the color of the house in which the robbers will divide the plunder. (Clearly, they have to break into that one as well!)</p>

### 출력

<p>Your program it to print exactly two lines to the standard output. The first of those should give the number of houses in which the criminals can meet while respecting aforementioned constraints. The second line should contain the increasing sequence of the numbers of those houses, separated by single spaces. If the robbers cannot meet at all, the first line should contain the number 0 while the second one should be empty.</p>

<p>&nbsp;</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/10127.%E2%80%85criminals/5d686d08.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/10127/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:146px; width:720px" /></p>

<p>In above example, the bandits may live in houses of color 2(Bitie in the house no. 1 or 4, Bytie in the house no. 15) or 6(Bitie in the house no. 3, Bytie in the house no. 14). Whether he lived in the house no. 1 or 4, Bitie could rob the following houses: 5 (of color 4), 6 (of color 7), and then either 7, 8 or 10 (of color 3). Bitie could rob the following houses: 12 (of color 5), meeting Bitie afterwards in either of 7, 8 or 10 (of color 3). The figure above depicts a scenario in which Bitie lives in the house no. 1 and the robbers meet in the house no. 8.</p>

<p>&mdash;&mdash;&mdash;&mdash;<br />
Sample grading tests:</p>

<ul>
	<li>1ocen: n=7, k=3, m=2, l=3, loot can be split in a unique house;</li>
	<li>2ocen: n=10, k=3, m=3, l=2, bandits cannot meet;</li>
	<li>3ocen: n=1,000, k=1, m=1, l=1, all houses of same color;</li>
	<li>4ocen: n=1,000,000, k=1,000, m=l=100, sequence of houses consists of 1,000 identical segments of 1,000 houses of successive colors from 1 to 1,000; the sequence of colors of houses broken into is 1,2,3,&hellip;,100 for each robber.</li>
</ul>