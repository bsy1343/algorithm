# [Platinum V] Butterfly - 13788

[문제 링크](https://www.acmicpc.net/problem/13788)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 29, 정답: 21, 맞힌 사람: 15, 정답 비율: 68.182%

### 분류

비트마스킹, 다이나믹 프로그래밍, 비트필드를 이용한 다이나믹 프로그래밍

### 문제 설명

<p>Claire is a man-eater. She&rsquo;s a real man-eater. She&rsquo;s going around with dozens of guys. She&rsquo;s dating all the time. And one day she found some conflicts in her date schedule. D&rsquo;oh!</p>

<p>So she needs to pick some dates and give the others up. The dates are set by hours like 13:00 to 15:00. She may have more than one date with a guy. For example, she can have dates with Adam from 10:00 to 12:00 and from 14:00 to 16:00 and with Bob from 12:00 to 13:00 and from 18:00 to 20:00. She can have these dates as long as there is no overlap of time. Time of traveling, time of make-up, trouble from love triangles, and the likes are not of her concern. Thus she can keep all the dates with Adam and Bob in the previous example. All dates are set between 6:00 and 22:00 on the same day.</p>

<p>She wants to get the maximum amount of satisfaction in total. Each guy gives her some satisfaction if he has all scheduled dates. Let&rsquo;s say, for example, Adam&rsquo;s satisfaction is 100 and Bob&rsquo;s satisfaction is 200. Then, since she can make it with both guys, she can get 300 in total.</p>

<p>Your task is to write a program to satisfy her demand. Then she could spend a few hours with you... if you really want.</p>

### 입력

<p>The input consists of a sequence of datasets. Each dataset has the following format:</p>

<pre>
<code>N 
Guy<sub>1</sub> 
. 
. 
. 
Guy<sub>N </sub></code></pre>

<p>The first line of the input contains an integer N (1 &le; N &le; 100), the number of guys. Then there come the descriptions of guys. Each description is given in this format:</p>

<pre>
<code>M L 
S<sub>1</sub> E<sub>1</sub> 
. 
. 
. 
S<sub>M</sub> E<sub>M</sub></code></pre>

<p>The first line contains two integers M<sub>i</sub> (1 &le; M<sub>i </sub>&le; 16) and L<sub>i</sub> (1 &le; L<sub>i</sub> &le; 100,000,000), the number of dates set for the guy and the satisfaction she would get from him respectively. Then M lines follow. The i-th line contains two integers S<sub>i</sub> and E<sub>i</sub> (6 &le; S<sub>i</sub> &lt; E<sub>i</sub> &le; 22), the starting and ending time of the i-th date.</p>

<p>The end of input is indicated by N = 0.</p>

### 출력

<p>For each dataset, output in a line the maximum amount of satisfaction she can get.</p>