# [Gold I] Leonardo’s Notebook - 3706

[문제 링크](https://www.acmicpc.net/problem/3706)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 82, 정답: 40, 맞힌 사람: 32, 정답 비율: 48.485%

### 분류

순열 사이클 분할

### 문제 설명

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/3706.%E2%80%85Leonardo%E2%80%99s%E2%80%85Notebook/9fe2777f.png" data-original-src="https://www.acmicpc.net/upload/images3/leonardo.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="float:right; height:293px; width:260px" />&mdash; I just bought Leonardo&rsquo;s secret notebook!</p>

<p>Rare object collector Stan Ucker was really agitated but his friend, special investigator Sarah Keptic was unimpressed.</p>

<p>&mdash; How do you know it is genuine?</p>

<p>&mdash; Oh, it must be, at that price. And it is written in the da Vinci code.</p>

<p>Sarah browsed a few of the pages. It was obvious to her that the code was a substitution cipher, where each letter of the alphabet had been substituted by another letter.</p>

<p>&mdash; Leonardo would have written the plain-text and left it to his assistant to encrypt, she said. And he must have supplied the substitution alphabet to be used. If we are lucky, we can find it on the back cover!</p>

<p>She turned up the last page and, lo and behold, there was a single line of all 26 letters of the alphabet:</p>

<p>QWERTYUIOPASDFGHJKLZXCVBNM</p>

<p>&mdash; This may be Leonardo&rsquo;s instructions meaning that each A in the plain-text was to be replaced by Q, each B with W, etcetera. Let us see...</p>

<p>To their disappointment, they soon saw that this could not be the substitution that was used in the book. Suddenly, Stan brightened.</p>

<p>&mdash; Maybe Leonardo really wrote the substitution alphabet on the last page, and by mistake his assistant coded that line as he had coded the rest of the book. So the line we have here is the result of applying some permutation TWICE to the ordinary alphabet!</p>

<p>Sarah took out her laptop computer and coded fiercely for a few minutes. Then she turned to Stan with a sympathetic expression.</p>

<p>&mdash; No, that couldn&rsquo;t be it. I am afraid that you have been duped again, my friend. In all probability, the book is a fake.</p>

<p>Write a program that takes a permutation of the English alphabet as input and decides if it may be the result of performing some permutation twice.</p>

### 입력

<p>The input begins with a positive number on a line of its own telling the number of test cases (at most 500). Then for each test case there is one line containing a permutation of the 26 capital letters of the English alphabet.</p>

### 출력

<p>For each test case, output one line containing Yes if the given permutation can result from applying some permutation twice on the original alphabet string ABC...XYZ, otherwise output No.</p>