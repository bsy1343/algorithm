# [Platinum I] Artificial Lake - 6154

[문제 링크](https://www.acmicpc.net/problem/6154)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 39, 정답: 20, 맞힌 사람: 19, 정답 비율: 52.778%

### 분류

구현, 자료 구조, 그리디 알고리즘, 정렬, 애드 혹, 시뮬레이션, 스택, 연결 리스트

### 문제 설명

<p>The oppressively hot summer days have raised the cows&#39; clamoring to its highest level. Farmer John has finally decided to build an artificial lake. For his engineering studies, he is modeling the lake as a two-dimensional landscape consisting of a contiguous sequence of N soon-to-be-submerged levels (1 &lt;= N &lt;= 100,000) conveniently numbered 1..N from left to right.</p>

<p>Each level i is described by two integers, its width W_i (1 &lt;= W_i &lt;= 1,000) and height (like a relative elevation) H_i (1 &lt;= H_i &lt;= 1,000,000). The heights of FJ&#39;s levels are unique. An infinitely tall barrier encloses the lake&#39;s model on the left and right. One example lake profile is shown below.</p>

<pre>
         *            *  :
         *             *  :
         *             *  8
         *    ***      *  7
         *    ***      *  6
         *    ***      *  5
         *    **********  4 &lt;- height
         *    **********  3
         ***************  2
         ***************  1
Level    |  1 |2|  3   |</pre>

<p>In FJ&#39;s model, he starts filling his lake at sunrise by flowing water into the bottom of the lowest elevation at a rate of 1 square unit of water per minute. The water falls directly downward until it hits something, and then it flows and spreads as room-temperature water always does. &nbsp;As in all good models, assume that falling and flowing happen instantly. Determine the time at which each elevation&#39;s becomes submerged by a single unit of water.</p>

<pre>
     WATER              WATER OVERFLOWS                     
       |                       |                           
     * |          *      *     |      *      *            *
     * V          *      *     V      *      *            *
     *            *      *    ....    *      *~~~~~~~~~~~~*
     *    **      *      *~~~~** :    *      *~~~~**~~~~~~*
     *    **      *      *~~~~** :    *      *~~~~**~~~~~~*
     *    **      *      *~~~~**~~~~~~*      *~~~~**~~~~~~*
     *    *********      *~~~~*********      *~~~~*********
     *~~~~*********      *~~~~*********      *~~~~*********
     **************      **************      **************
     **************      **************      **************

     After 4 mins        After 26 mins       After 50 mins
     Lvl 1 submerged     Lvl 3 submerged     Lvl 2 submerged</pre>

<p>Warning: The answer will not always fit in 32 bits.</p>

### 입력

<ul>
	<li>Line 1: A single integer: N</li>
	<li>Lines 2..N+1: Line i+1 describes level i with two space-separated integers: W_i and H_i</li>
</ul>

<p>&nbsp;</p>

### 출력

<ul>
	<li>Lines 1..N: Line i contains a single integer that is the number of minutes that since sunrise when level #i is covered by water of height 1.</li>
</ul>

<p>&nbsp;</p>