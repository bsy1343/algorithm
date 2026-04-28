# [Platinum V] Easy representation - 27721

[문제 링크](https://www.acmicpc.net/problem/27721)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 3, 정답: 3, 맞힌 사람: 3, 정답 비율: 100.000%

### 분류

자료 구조, 다이나믹 프로그래밍, 트리에서의 다이나믹 프로그래밍, 스택, 트리

### 문제 설명

<p>Peter is preparing slides for his lecture on parsing arithmetic expressions. In the first part of the lecture he wants to focus just on parsing brackets. He invented an interesting geometric representation of a correct bracket sequence for his students, because one image is better than a thousand words:</p>

<p style="text-align: center;"><code>(())(()(()))</code> = <img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27721.%E2%80%85Easy%E2%80%85representation/c341b150.png" data-original-src="https://upload.acmicpc.net/9755421c-b8eb-4ba5-a131-0189b34c3158/-/crop/669x206/3,0/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 335px; height: 103px;" /></p>

<p>Formally, the definition of the geometric representation looks as follows. The simplest correct bracket sequence <code>()</code> is represented by a 1 &times; 1 square. If A is a correct bracket sequence and g(<code>A</code>) its represenation, then the representation for <code>(A)</code> is g(<code>A</code>) surrounded by a rectangle two units wider than g(<code>A</code>) and one unit taller than the highest point of g(<code>A</code>). If A and B are two correct bracket sequences and g(<code>A</code>) and g(<code>B</code>) are their representations, then we get g(<code>AB</code>) by placing g(<code>B</code>) one unit to the right of g(<code>A</code>).</p>

<p>After he finished his slides, Peter started to play with the images he prepared. He painted the bounded areas of the images alternately black and white, in such a way that the outer-most areas are all painted black. For the example above this coloring looks as follows:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/27721.%E2%80%85Easy%E2%80%85representation/71a6e029.png" data-original-src="https://upload.acmicpc.net/fa8f2c6a-8534-4c37-a846-e47919a467ea/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 103px;" /></p>

<p>You are given a correct bracket sequence. Calculate the area that is colored black.</p>

### 입력

<p>The first line of the input file contains an integer T specifying the number of test cases. Each test case is preceded by a blank line. Each test case consists of one line with a correct bracket sequence. Every line will only contain characters &lsquo;<code>(</code>&rsquo; and &lsquo;<code>)</code>&rsquo;.</p>

### 출력

<p>For each test case output one line with one integer &ndash; the area of the black part of the corresponding geometric representation.</p>

### 힌트

<p>The second test case is the one shown in the pictures above.</p>