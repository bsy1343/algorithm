# [Platinum II] Kralj - 13488

[문제 링크](https://www.acmicpc.net/problem/13488)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 128 MB

### 통계

제출: 68, 정답: 26, 맞힌 사람: 22, 정답 비율: 44.000%

### 분류

자료 구조, 그리디 알고리즘, 트리를 사용한 집합과 맵, 집합과 맵

### 문제 설명

<p>Young ruler Mirko has declared himself king of dwarves. Upon hearing this, Slavko felt&nbsp;threatened and soon declared himself king of elves! As there cannot be more than one king&nbsp;in the land, they have decided to resolve the issue of power once and for all.</p>

<p>Slavko will, along with N strongest elves of the kingdom, labeled with numbers from 1 to N,&nbsp;go visit Mirko&rsquo;s castle. In the castle hall, they will be greeted by N strongest dwarves sitting&nbsp;in a circle, labeled clockwise ​with numbers from 1 to N.</p>

<p>Mirko has, upon entering the castle, given a number A<sub>i</sub>&nbsp;to each of Slavko&rsquo;s elves &ndash; the label&nbsp;of the dwarf it will fight against. Unfortunately, he didn&rsquo;t make sure that each elf should get a&nbsp;unique adversary, and soon a terrible fight broke out.</p>

<p>They have decided to solve the problem in the following way:</p>

<ul>
	<li>Slavko will send his elves to the hall one by one, in the order he chooses. The next&nbsp;elf can enter the hall only after the one before him found a place to sit.</li>
	<li>The elf labeled k will first approach the dwarf labeled A<sub>k</sub>. If there isn&rsquo;t an elf sitting&nbsp;beside the dwarf, he will sit there. Otherwise, he will continue walking, from dwarf to&nbsp;dwarf, clockwise, until he finds an unclaimed dwarf.</li>
</ul>

<p>Now the N resulting pairs of elves and dwarves compete in armwrestling, and the stronger&nbsp;one always wins​.</p>

<p>Slavko is well prepared for this event. He has studied all the fighters and determined the&nbsp;strength of each one. Now he wants to send the elves to the hall in the order which, after&nbsp;they all sit down, will bring the most victories for him.</p>

<p>Help him and calculate the highest number of victories​ in duels that can be achieved by&nbsp;elves​!&nbsp;</p>

### 입력

<p>The first line of input contains the integer N (1 &le; N &le; 5&sdot;10<sup>5</sup>)</p>

<p>The second line of input contains N integers A<sub>i&nbsp;</sub>(1 &le; A<sub>i</sub>&nbsp;&le; N), the adversaries chosen by Mirko.</p>

<p>The third line of input contains N integers P<sub>i</sub>&nbsp;(1 &le; P<sub>i</sub>&nbsp;&le; 10<sup>9</sup>), the dwarves&rsquo; strengths.</p>

<p>The fourth line of input contains N integers V<sub>i</sub>&nbsp;(1 &le; V<sub>i</sub>&nbsp;&le; 10<sup>9</sup>), the elves&rsquo; strengths.</p>

<p>All strengths from the input will be mutually distinct.</p>

### 출력

<p>The first and only line of input must contain the maximum number of victories that can be&nbsp;achieved by elves.&nbsp;</p>

### 힌트

<p>Slavko can sort the elves in the following way: 3, 2, 1. This way, the elf number 3 will sit beside dwarf&nbsp;number 3, elf 2 will have to move one seat clockwise and sit beside dwarf 1, and the elf number 2 will sit&nbsp;beside the dwarf number 2. Elves 1 and 2 will win their duels, and elf 3 will lose.&nbsp;</p>