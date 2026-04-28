# [Platinum II] Wedding DJ - 25848

[문제 링크](https://www.acmicpc.net/problem/25848)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 16, 맞힌 사람: 14, 정답 비율: 51.852%

### 분류

가장 긴 증가하는 부분 수열 문제

### 문제 설명

<p>You have always wanted to be a DJ and finally got your first opportunity! You have a list of songs that you will play at a wedding in the order the songs appear in the list. Each song has a &ldquo;fun level&rdquo; but the problem is that B&amp;G (the bride and the groom) do not want any song to be played after a song with a lower fun level, i.e., B&amp;G consider the wedding playlist good only if the fun level of the songs do not ever decrease. Fortunately, you can adjust the fun level of songs. You can choose to change all songs with fun level x to fun level y, e.g., you can choose to change all songs with fun level 10 to fun level 7 (or to fun level 18). Note that:</p>

<ul>
	<li>When you choose to change all songs with fun level x to fun level y, even though all the songs with fun level x are changed, this is considered as one change.</li>
	<li>When you choose to change all songs with fun level x, all the songs with fun level x change and not a selected subset of the songs with fun level x.</li>
	<li>If you change all songs with fun level x to fun level y and then you decide to change all the songs with fun level y to fun level z, the second change applies to the updated list and not the original list. For example, if the original list is {&hellip; 3 &hellip; 8 &hellip; 3 &hellip; 8 &hellip; 3 &hellip;} and you decide to change fun level 3 to 8 and then decide to change fun level 8 to 2, five songs change their fun level to 2 and not two songs.</li>
</ul>

<p>Given the order of the fun level of a list of songs, determine the minimum number of playlist adjustments in the form of transforming all songs of level x into level y, such that the fun level of the songs of the playlist is non-decreasing.</p>

### 입력

<p>The first input line contains an integer, n (1 &le; n &le; 100,000), representing the number of songs in the playlist. The following input line contains n space separated integers, representing the fun level for the songs in the order they appear in the playlist; each fun level is between 1 and 1,000,000,000 (inclusive).</p>

### 출력

<p>Print the minimum number of adjustments to make the playlist&rsquo;s fun level non-decreasing.</p>

### 힌트

<p>Explanation of the first Sample Input/Output:</p>

<p>One way to make the list non-decreasing is:</p>

<ul>
	<li>Change all 7&rsquo;s to 1</li>
	<li>Change all 8&rsquo;s to 3</li>
	<li>Change all 5&rsquo;s to 3</li>
</ul>

<p>for a total of 3 changes.</p>