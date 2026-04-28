# [Platinum I] Rainfall Storage - 14693

[문제 링크](https://www.acmicpc.net/problem/14693)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 18, 정답: 13, 맞힌 사람: 10, 정답 비율: 76.923%

### 분류

다이나믹 프로그래밍, 해 구성하기, 비트 집합

### 문제 설명

<p>It was a dark and stormy night. It also rained, and rained, and rained.</p>

<p>Lucy wants to capture some of the rain, but she only has limited materials. She has a collection of pillars, of various heights, which she can configure to capture the rain. Each pillar is an integer height and has length and width of 1. Once Lucy has her configuration of pillars, she has enough other siding material to enclose the front and back to allow rain to fill the all the available space in between pillars. There is more than enough rain and any excess rain will overflow and get absorbed into the earth.</p>

<p>For example, if Lucy has pillars of height 1,5,2,1,4 she could configure them as follows (all configurations are illustrated from the side):</p>

<pre>
 *
 *  *
 *  *
 ** *
*****</pre>

<p>which would capture 5 units of rain (<code>R</code>) as follows:</p>

<pre>
 *
 *RR*
 *RR*
 **R*
*****</pre>

<p>For this first collection of pillars (1,5,2,1,4), she could also capture 6 units of rain as follows:</p>

<pre>
 *
 *RR*
 *RR*
**RR*
*****</pre>

<p>As another example, if the collection of pillars was 5,1,5,1,5, Lucy could capture 8 units of rain as follows:</p>

<pre>
*R*R*
*R*R*
*R*R*
*R*R*
*****</pre>

<p>Finally, this configuration of (5, 1, 4, 1, 5) captures 9 units of rain:</p>

<pre>
*RRR*
*R*R*
*R*R*
*R*R*
*****</pre>

<p>Lucy has N pillars (2 &le; N &le; 500) with heights h<sub>1</sub>, h<sub>2</sub> &hellip; h<sub>N</sub> (1 &le; h<sub>i</sub> &le; 50). She would like to know, of all possible configurations of pillars, what are all of the obtainable volumes of rainfall that she can capture using these N pillars.</p>

### 입력

<p>The first line contains the integer N (2 &le; N &le; 500) signifying the number of pillars. The next line contains the integers h<sub>i</sub> (1 &le; h<sub>i</sub> &le; 50, 1 &le; i &le; N), representing the iith pillar height.</p>

<p>For 5 of the 25 marks available, N &le; 10.</p>

<p>For an additional 10 of the 25 marks available, N &le; 50.</p>

### 출력

<p>On one line, output a space-separated list of all possible obtainable integer volumes of rain captured, in increasing order.</p>