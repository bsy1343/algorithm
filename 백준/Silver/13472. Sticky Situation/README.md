# [Silver IV] Sticky Situation - 13472

[문제 링크](https://www.acmicpc.net/problem/13472)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 237, 정답: 154, 맞힌 사람: 137, 정답 비율: 64.019%

### 분류

수학, 그리디 알고리즘, 정렬, 기하학

### 문제 설명

<p>While on summer camp, you are playing a&nbsp;game of hide-and-seek in the forest. You need&nbsp;to designate a &ldquo;safe zone&rdquo;, where, if the players&nbsp;manage to sneak there without being detected,&nbsp;they beat the seeker. It is therefore of utmost&nbsp;importance that this zone is well-chosen.</p>

<p>You point towards a tree as a suggestion, but&nbsp;your fellow hide-and-seekers are not satisfied.&nbsp;After all, the tree has branches stretching far&nbsp;and wide, and it will be difficult to determine&nbsp;whether a player has reached the safe zone. They want a very specific demarcation for the&nbsp;safe zone. So, you tell them to go and find some sticks, of which you will use three to mark a&nbsp;non-degenerate triangle (i.e. with strictly positive area) next to the tree which will count as&nbsp;the safe zone. After a while they return with a variety of sticks, but you are unsure whether&nbsp;you can actually form a triangle with the available sticks.</p>

<p>Can you write a program that determines whether you can make a triangle with exactly three&nbsp;of the collected sticks?</p>

### 입력

<p>The first line contains a single integer N, with 3 &le; N &le; 20 000, the number of sticks collected.&nbsp;Then follows one line with N positive integers, each less than 2<sup>60</sup>, the lengths of the sticks&nbsp;which your fellow campers have collected.</p>

### 출력

<p>Output a single line containing a single word: possible if you can make a non-degenerate&nbsp;triangle with three sticks of the provided lengths, and impossible if you can not.</p>