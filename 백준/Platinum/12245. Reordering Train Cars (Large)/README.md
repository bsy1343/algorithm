# [Platinum IV] Reordering Train Cars (Large) - 12245

[문제 링크](https://www.acmicpc.net/problem/12245)

### 성능 요약

시간 제한: 5 초, 메모리 제한: 512 MB

### 통계

제출: 26, 정답: 10, 맞힌 사람: 10, 정답 비율: 40.000%

### 분류

많은 조건 분기, 구현

### 문제 설명

<p>Yahya is a brilliant kid, so his mind raises a lot of interesting questions when he plays with his toys. Today&#39;s problem came about when his father brought him a set of <a href="https://www.google.com/search?q=train+car+toys&amp;tbm=isch">train cars</a>, where each car has a lowercase letter written on one side of the car.</p>

<p>When he first saw the gift, he was happy and started playing with them, connecting cars together without any particular goal. But after a while he got bored (as usual) from playing without having any goal. So, he decided to define a new interesting problem.</p>

<p>The problem is that he currently has <strong>N</strong> sets of connected cars. He can represent each set of connected cars as a string of lowercase letters. He wants to count the number of ways he can connect all <strong>N</strong> sets of cars to form one <em>valid</em> train. A train is valid if all occurrences of the same character are adjacent to each other.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/12245.%E2%80%85Reordering%E2%80%85Train%E2%80%85Cars%E2%80%85(Large)/23c4bbb1.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/12244/images-62.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:199px; width:511px" /></p>

<p>The previous figure is one way Yahya could connect the cars &quot;ab&quot;, &quot;bc&quot; and &quot;cd&quot; to make a valid train: &quot;ab bc cd&quot;. If he had connected them in the order &quot;cd ab bc&quot;, that would have been invalid: the &quot;c&quot; characters would not have been adjacent to each other.</p>

<p>You&#39;ve surely noticed that this is not an easy problem for Yahya to solve, so he needs your help (and he is sure that you will give it!). That&#39;s it; go and help Yahya!</p>

<p><strong>Note</strong>: letters are written only on one side of the cars, so you can not reverse them. For example, if a car has &quot;ab&quot; written on it, it could not be changed to read &quot;ba&quot;.</p>

### 입력

<p>The first line of the input gives the number of test cases, <strong>T</strong>. <strong>T</strong> test cases follow. The first line of each test case contains a single integer <strong>N</strong>, the number of sets of connected cars. The following line contains <strong>N</strong> strings separated by a single space. Every given string represents a set of connected cars and is composed of lowercase English letters only.</p>

<p>Limits</p>

<ul>
	<li>1 &le; <strong>T</strong> &le; 100.</li>
	<li>1 &le; Set of connected <strong>Cars&#39;</strong> lengths &le; 100.</li>
	<li>1 &le; <strong>N</strong> &le; 100.</li>
</ul>

### 출력

<p>For each test case, output one line containing &quot;Case #x: y&quot;, where x is the test case number (starting from 1) and y is the number of different ways of obtaining a valid train. As this number may be very big, output the number of ways <em>modulo 1,000,000,007</em>.</p>

### 힌트

<p>Sample Explanation</p>

<p>In the first case, there is only one way to form a valid train by joining string <em>&quot;ab&quot;</em> to <em>&quot;bbbc&quot;</em> to <em>&quot;cd&quot;</em> in this order.</p>

<p>While in the second case, there are 4 possible ways to form a valid train. Notice that there are two different sets of connected cars represented by the string <em>&quot;aa&quot;</em>, so there are two different ways to order these two strings and to group them to be one set of connected cars <em>&quot;aaaa&quot;</em>. Also there is only one way to order set of cars <em>&quot;bc&quot;</em> with <em>&quot;c&quot;</em> in only one way to be <em>&quot;bcc&quot;</em>. After that you can order <em>&quot;aaaa&quot;</em> and <em>&quot;bcc&quot;</em> in two different ways. So totally there are 2*2 = 4 ways to form a valid train.</p>

<p>In the third sample case, there is no possible way to form a valid train, as if joined in any of the two ways <em>&quot;abc&quot;+&quot;bcd&quot;</em> or <em>&quot;bcd&quot;+&quot;abc&quot;</em>, there will be two letters of <em>&quot;b&quot;</em> and <em>&quot;c&quot;</em> not consecutive.</p>