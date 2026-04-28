# [Gold I] Getting-Up Syndrome - 17308

[문제 링크](https://www.acmicpc.net/problem/17308)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 49, 정답: 21, 맞힌 사람: 20, 정답 비율: 45.455%

### 분류

비트마스킹, 그리디 알고리즘

### 문제 설명

<p>In the 21st century, many people have contracted an odd disorder &ndash; getting-up syndrome. Symptoms include having great difficulty getting out of bed in the morning and feeling out of sorts even after getting up. As a generally high-spirited teenager, ATM has been struggling with getting-up syndrome. Through extensive researching, he has found the cause of the disorder. On the vast seabeds of the Pacific Ocean, there lives a giant dragon by the name of DRD who holds the essence of sleep itself and can extend everyone&#39;s sleeping time at his will. So with DRD&#39;s every movement, getting-up syndrome intensifies for everyone, growing at a frightening rate to affect more and more people in the world. To put an end to this terrible malady, ATM has decided to travel to the seabed of the Pacific and slay this evil dragon once and for all.</p>

<p>After untold hardships, ATM has finally reached DRD&#39;s resting place. He now braces for the arduous battle that lies ahead. DRD has a very special tactic. His line of defense involves transforming the attack power of the opponent using a series of calculations to minimize the damage done to himself. Roughly speaking, DRD&#39;s line of defense consists of&nbsp;<var>n</var>&nbsp;defense gates. Each gate contains an operator&nbsp;<var>op</var>&nbsp;and a parameter&nbsp;<var>t</var>. The operator is guaranteed to be one of&nbsp;<code>OR</code>,&nbsp;<code>XOR</code>, or&nbsp;<code>AND</code>, while the parameter is guaranteed to be a nonnegative integer. If one&#39;s power before going through a defense gate is&nbsp;<var>x</var>, then the power after going through it is&nbsp;<var>x</var>&nbsp;<var>op</var>&nbsp;<var>t</var>. Finally, the damage done to DRD is equal to his opponent&#39;s initial striking power&nbsp;<var>x</var>&nbsp;<b>after it has been through all&nbsp;<var>n</var>&nbsp;defense gates</b>.</p>

<p>Since ATM&#39;s skill is limited, the initial attack power of his strike can only be an integer between 0 and&nbsp;<var>m</var>&nbsp;(he many pick any number of 0, 1, &hellip;,&nbsp;<var>m</var>&nbsp;to be his initial attack power), but the final attack power after it has been through the gates is not bounded by&nbsp;<var>m</var>. To conserve energy, he will have to pick the optimal initial power with which to attack to maximize the damage done to DRD. Please help him calculate how much damage he can do to DRD with one strike.</p>

### 입력

<p>The first line contains two integers&nbsp;<var>n</var>&nbsp;and&nbsp;<var>m</var>, indicating that DRD uses&nbsp;<var>n</var>&nbsp;defense gates and that ATM can pick any integer between 0 and&nbsp;<var>m&nbsp;</var>as his initial striking power.</p>

<p>The next&nbsp;<var>n</var>&nbsp;lines each describes a single defense gate. Each line consists of a single string of characters representing&nbsp;<var>op</var>, followed by a space, followed by a nonnegative integer&nbsp;<var>t</var>&nbsp;representing the parameter number of that gate.​​​​​​​</p>

### 출력

<p>Output one line consisting of a single integer, representing the maximum possible damage that ATM could do to DRD in one strike.</p>

### 제한

<ul>
	<li>2 &le;&nbsp;<var>n</var>&nbsp;&le; 10<sup>5</sup></li>
	<li>2 &le;&nbsp;<var>m</var>&nbsp;&le; 10<sup>9</sup></li>
	<li>0 &le;&nbsp;<var>t</var>&nbsp;&le; 10<sup>9</sup>&nbsp;</li>
	<li><var>op</var>&nbsp;is one of&nbsp;<code>OR</code>,&nbsp;<code>XOR</code>,&nbsp;<code>AND</code></li>
</ul>