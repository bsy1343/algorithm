# [Platinum IV] Dishonest Driver - 17564

[문제 링크](https://www.acmicpc.net/problem/17564)

### 성능 요약

시간 제한: 6 초, 메모리 제한: 512 MB

### 통계

제출: 91, 정답: 55, 맞힌 사람: 45, 정답 비율: 62.500%

### 분류

다이나믹 프로그래밍, 문자열, 해싱

### 문제 설명

<p>When you arrived at Charles de Gaulle airport, you naively accepted a ride to Paris by an unauthorized driver who offered you &ldquo;competitive prices&rdquo;. The end result was a disaster: not only was the price extremely high, but the driver made the trip much longer than necessary in order to justify that price.</p>

<p>You noticed the scam because you were traveling several times by the same place: indeed, you have such a good memory that you can remember very well the path you followed, including each of the loops that your scammer forced you to take.</p>

<p>Now, you are at the police station to fill a complaint against this driver and an officer asks you to tell your story. She even asks you to give all the details of the path you took. Because you do not want to lose yet another couple of hours in doing so, you decide to give a compressed version of it.</p>

<p>Suppose you remember you traveled through places A, B, C, D, A, B, C, D. In this case, you prefer telling the officer &ldquo;I followed twice the path ABCD&rdquo;, rather than &ldquo;I followed the path ABCDABCD&rdquo;. Given that your path repeated the same sequence of places, this will significantly shorten your statement, without missing any detail.</p>

<p>More precisely, you have to write a program that takes as input the list of places you traveled through, and which returns the size of the shortest compressed form of this path. Such a compressed path can either be:</p>

<ul>
	<li>a single place through which you traveled, called an &ldquo;atomic path&rdquo;;</li>
	<li>the concatenation of two compressed paths;</li>
	<li>the repetition of a compressed path, i.e., (C)<sup>n</sup>, meaning that you traveled through the path described by C, n times in a row.</li>
</ul>

<p>The size of a compressed path is defined as the number of atomic paths it contains.</p>

### 입력

<p>The input consists of two lines:</p>

<ul>
	<li>The first line contains one integer, N, the length of the path.</li>
	<li>The second line contains the path, described as a string of size N. Each location is described by an alphanumeric character: either a digit (from &lsquo;0&rsquo; to &lsquo;9&rsquo;), a lowercase letter (from &lsquo;a&rsquo; to &lsquo;z&rsquo;) or an uppercase letter (from &lsquo;A&rsquo; to &lsquo;Z&rsquo;).</li>
</ul>

### 출력

<p>The output should consist of a single line, whose content is an integer, the size of the shortest compressed path.</p>

### 제한

<ul>
	<li>0 &lt; N &le; 700</li>
</ul>