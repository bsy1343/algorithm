# [Gold II] Sorting Slides - 6310

[문제 링크](https://www.acmicpc.net/problem/6310)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 147, 정답: 27, 맞힌 사람: 17, 정답 비율: 20.732%

### 분류

브루트포스 알고리즘, 이분 매칭

### 문제 설명

<p>Professor Clumsey is going to give an important talk this afternoon. Unfortunately, he is not a very tidy person and has put all his transparencies on one big heap. Before giving the talk, he has to sort the slides. Being a kind of minimalist, he wants to do this with the minimum amount of work possible.</p>

<p>The situation is like this. The slides all have numbers written on them according to their order in the talk. Since the slides lie on each other and are transparent, one cannot see on which slide each number is written.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/6310.%E2%80%85Sorting%E2%80%85Slides/20cb703c.png" data-original-src="https://www.acmicpc.net/upload/images2/slides.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:203px; width:265px" /></p>

<p>Well, one cannot see on which slide a number is written, but one may deduce which numbers are written on which slides. If we label the slides which characters A, B, C, ... as in the figure above, it is obvious that D has number 3, B has number 1, C number 2 and A number 4.</p>

<p>Your task, should you choose to accept it, is to write a program that automates this process.</p>

### 입력

<p>The input consists of several heap descriptions. Each heap descriptions starts with a line containing a single integer n, the number of slides in the heap. The following n lines contain four integers x<sub>min</sub>, x<sub>max</sub>, y<sub>min</sub> and y<sub>max</sub>, each, the bounding coordinates of the slides. The slides will be labeled as A,B,C,... in the order of the input.</p>

<p>This is followed by n lines containing two integers each, the x- and y-coordinates of the n numbers printed on the slides. The first coordinate pair will be for number 1, the next pair for 2, etc. No number will lie on a slide boundary.</p>

<p>The input is terminated by a heap description starting with n = 0, which should not be processed.</p>

### 출력

<p>For each heap description in the input first output its number. Then print a series of all the slides whose numbers can be uniquely determined from the input. Order the pairs by their letter identifier.</p>

<p>If no matchings can be determined from the input, just print the word none on a line by itself.</p>

<p>Output a blank line after each test case.</p>