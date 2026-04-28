# [Platinum IV] Laundry - 7911

[문제 링크](https://www.acmicpc.net/problem/7911)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 128 MB

### 통계

제출: 111, 정답: 37, 맞힌 사람: 33, 정답 비율: 32.353%

### 분류

자료 구조, 그리디 알고리즘, 집합과 맵, 트리를 사용한 집합과 맵

### 문제 설명

<p>A few friends have decided to do laundry together. They are all very neat, so each day each of the friends wears one clean pair of socks and one clean shirt. The friends have put all dirty socks and shirts to their washing machine. Now they have started to plan how they will dry their laundry. To put this in order, they have decided that:</p>

<ul>
	<li>every sock will be fastened to the string with a single clothespin,</li>
	<li>each shirt will be fastened with three clothespins,</li>
	<li>one person&rsquo;s socks should all be fastened with clothespins of the same color,</li>
	<li>one person&rsquo;s shirts should all be fastened with clothespins of the same color,</li>
	<li>clothes belonging to different persons may not be fastened with clothespins of the same color,</li>
	<li>apart from that, they wish to use the smallest possible number of clothespin&rsquo;s colors.</li>
</ul>

<p>Now they have scattered all their clothespins on the floor and counted the number of clothespins of each color. Unfortunately, they were not able to figure out which colors should each of them use. Write a program that will help them with this problem.</p>

### 입력

<p>The first line of input contains two integers n and k (2 &le; n,&nbsp;k &le; 1 000 000) denoting the number of friends and the number of clothespins&rsquo; colors available. The second line contains n numbers d<sub>1</sub>, d<sub>2</sub>, ..., d<sub>n</sub> representing the number of days each friend was collecting laundry (1 &le; d<sub>i</sub> &le; 1 000 000). The third line contains k numbers l<sub>1</sub>, l<sub>2</sub>, ..., l<sub>k</sub> representing the numbers of clothespins of respective colors (1 &le; l<sub>i</sub> &le; 4 000 000).</p>

### 출력

<p>Your program should output the minimal number of clothespins needed to dry all the laundry. If it is not possible to dry all the laundry in the requested manner, your program should output a single word NIE (i.e., no in Polish).</p>

### 힌트

<p>Explanation for the first example: The first person needs 6 clothespins for her socks and 9 clothespins for her shirts. The second person needs 8 clothespins for her socks and 12 clothespins for her shirts. The second person should use the clothespins of the first color both for her socks and her shirts. The first person may then use, e.g., the clothespins of the second and the fourth color.</p>