# [Platinum V] Folding a Cube - 17876

[문제 링크](https://www.acmicpc.net/problem/17876)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 88, 정답: 45, 맞힌 사람: 41, 정답 비율: 57.746%

### 분류

구현, 기하학, 시뮬레이션, 3차원 기하학

### 문제 설명

<p>It is well known that a set of six unit squares that are attached together in a &ldquo;cross&rdquo; can be folded into a cube.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/687d882e-8798-4f76-a708-e37845ba4539/-/preview/" style="width: 579px; height: 164px;" /></p>

<p>But what about other initial shapes? That is, given six unit squares that are attached together along some of their sides, can we form a unit cube by folding this arrangement?</p>

### 입력

<p>Input consists of 6 lines each containing 6 characters, describing the initial arrangement of unit squares. Each character is either a <code>.</code>, meaning it is empty, or a <code>#</code> meaning it is a unit square.</p>

<p>There are precisely 6 occurrences of <code>#</code> indicating the unit squares. These form a connected component, meaning it is possible to reach any <code>#</code> from any other <code>#</code> without touching a <code>.</code> by making only horizontal and vertical movements. Furthermore, there is no 2 &times; 2 subsquare consisting of only <code>#</code>. That is, the pattern</p>

<pre>
##
##</pre>

<p>does not appear in the input.</p>

### 출력

<p>If you can fold the unit squares into a cube, display can fold. Otherwise display cannot fold.</p>