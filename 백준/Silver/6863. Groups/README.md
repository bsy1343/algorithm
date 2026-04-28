# [Silver II] Groups - 6863

[문제 링크](https://www.acmicpc.net/problem/6863)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 42, 정답: 16, 맞힌 사람: 13, 정답 비율: 33.333%

### 분류

많은 조건 분기, 구현

### 문제 설명

<p>In mathematics, a group, G, is an object that consists of a set of elements and an operator (which we will call &times;) so that if x and y are in so is x &times; y. Operations also have the following properties:</p>

<ul>
	<li>Associativity: For all x, y and z in G, x &times; (y &times; z) = (x &times; y) &times; z.</li>
	<li>Identity: the group contains an &ldquo;identity element&rdquo; (we can use i) so that for every x in G, x &times; i = x and i &times; x = x.</li>
	<li>Inverse: for every element x there is an inverse element (we denote by x<sup>-1</sup>) so that x &times; x<sup>-1</sup> = i and x<sup>-1</sup> &times; x = i.</li>
</ul>

<p>Groups have a wide variety of applications including the modeling of quantum states of an atom and the moves in solving a Rubik&rsquo;s cube puzzle. Clearly the integers under addition from a group (0 is the identity, and the inverse of x is -x, and you can prove associativity as an exercise), though that group is infinite and this problem will deal only with finite groups.</p>

<p>One simple example of a finite group is the integers modulo 10 under the operation addition. That is, the group consists of the integers 0, 1, ..., 9 and the operation is to add two keeping only the least significant digit. Here the identity is 0. This particular group has the property that x times; y = y times; x, but this is not always the case. Consider the group that consists of the elements a, b, c, d, e and i. The &ldquo;multiplication table&rdquo; below defines the operations. Note that each of the required properties is satisfied (associativity, identity and inverse) but, for example, c &times; d = a while d &times; c = b.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/6863.%E2%80%85Groups/c879ed0c.png" data-original-src="https://upload.acmicpc.net/a7df45c7-df5a-42eb-a5fe-4df7328687ae/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 161px; height: 149px;" /></p>

<p>Your task is to write a program which will read a sequence of multiplication tables and determine whether each structure defined is a group.</p>

### 입력

<p>The input will consist of a number of test cases. Each test case begins with an integer n (0 &le; n &le; 100). If the test case begins with n = 0, the program terminates. To simplify the input, we will use the integers 1, ..., n to represent n elements of the candidate group structure; the identity could be any of these (i.e., it is not necessarily the element 1). Following the number n in each test case are n lines of input, each containing n integers in the range [1, ..., n]. The qth integer on the pth line of this sequence is the value p &times; q.</p>

### 출력

<p>If the object is a group, output yes (on its own line), otherwise output no (on its own line). You should not output anything for the test case where n = 0.</p>