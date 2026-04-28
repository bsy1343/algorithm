# [Gold V] Encyclopedia - 8374

[문제 링크](https://www.acmicpc.net/problem/8374)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 35, 정답: 14, 맞힌 사람: 13, 정답 비율: 39.394%

### 분류

자료 구조, 그리디 알고리즘, 스택

### 문제 설명

<p>Little John loves reading Bytean encyclopedia. He is especially fascinated with the colorful illustrations the book contains. Bytean encyclopedia consists of many independent parts. Once in a while some new pages are printed. John&#39;s parents then add them to a binder containing all previous pages of the encyclopedia. In order to protect encyclopedia&#39;s pages from getting dirty, John&#39;s parents put each of them into a separate transparent shirt.</p>

<p>One day John dropped the book on the floor - all shirts fell out of the binder and all pages fell out of the shirts. Luckily, nothing got lost (neither pages nor shirts) and the number of pages is still equal to the number of shirts. John picked up all elements from the floor and put all of them together, forming a stack. He wants to put all elements back into the binder. Firstly, he needs to reorder pages and shirts in the stack so that pages are interleaved by shirts. John can&#39;t read, so the order of pages is not an issue for him. The only important thing is that all pages should be located back in shirts.</p>

<p>In each move John can swap positions of two consecutive elements in the stack. He finishes the process of reording when pages and shirts occur in the stack alternately.</p>

<p>Help Little John and calculate how many swap operations of consecutive elements in the stack are necessary to perform the desired reordering.</p>

<p>Write a program which:</p>

<ul>
	<li>reads from the standard input the description of the stack,</li>
	<li>calculates how many swap operations are required to order elements of Bytean encyclopedia,</li>
	<li>writes the result to the standard output.</li>
</ul>

### 입력

<p>The first line of the standard input contains one integer <em>n</em>&nbsp;(1 &le; <em>n</em> &le; 1 000 000)&nbsp;representing the number of pages (which is also equal to the number of shirts) in the Bytean encyclopedia.</p>

<p>The following lines contain the description of the stack: 2&nbsp;&middot; <em>n</em>&nbsp;non-negative integers. The <em>i</em>-th number describes&nbsp;<em>i</em>-th element on the stack and is equal 0, if that element is a shirt. Otherwise it is a positive number not grater than 1 000 000 000.</p>

<p>Description of the stack contains the same number of zeros as positive numbers. Encyclopedia is not perfect and pages numbers might repeat.</p>

### 출력

<p>One integer should be written to the standard output - the minimal number of swap operations that have to be performed to put Bytean encyclopedia back together.</p>