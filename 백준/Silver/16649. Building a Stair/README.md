# [Silver I] Building a Stair - 16649

[문제 링크](https://www.acmicpc.net/problem/16649)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 512 MB

### 통계

제출: 129, 정답: 82, 맞힌 사람: 68, 정답 비율: 65.385%

### 분류

해 구성하기

### 문제 설명

<p>Little Barney just got a new toy cube set from his parents. His set contains n identical cubes. Barney immediately started building various objects with these cubes.</p>

<p>The latest thing Barney built is a stair. A stair consists of one or more towers of cubes, where the heights of towers are non-increasing from left to right. In the following picture, you can see three different shapes with 12 cubes each. The first two are stairs and the third one is not a stair.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/7243fc1c-b5a6-4896-9477-f2f59d0b99a6/-/preview/" style="width: 266px; height: 87px;" /></p>

<p>Barney noticed that for some stairs you can turn your head 90 degrees to the right and you will see the same stair, but reversed! He calls such stairs symmetric. For example, the first stair above is symmetric, but the second one is not. Formally, a stair is symmetric if and only if when you reflect the picture over the x = y line, you get the same stair (where the x-axis is horizontal and oriented to the right, and the y-axis is vertical and oriented upwards).</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8c33cb72-69e6-4797-9077-a6641f69a7ce/-/preview/" style="width: 116px; height: 117px;" /></p>

<p>Barney wants to build a symmetric stair using all of his n cubes. Show him how to do it!</p>

### 입력

<p>The single line of the input contains an integer n &mdash; the number of cubes at Barney&rsquo;s disposal (1 &le; n &le; 100).</p>

### 출력

<p>If there is no symmetric stair with n cubes, output a single integer &minus;1.</p>

<p>Otherwise, in the first line, output one integer m &mdash; the number of rows and columns in the picture of the stair (1 &le; m &le; 100). Then, output m lines describing the stair. Each line must contain exactly m characters &lsquo;o&rsquo; (a lowercase English letter) or &lsquo;.&rsquo;, where &lsquo;o&rsquo; describes a cell with a cube, and &lsquo;.&rsquo; describes an empty cell. There must be exactly n &lsquo;o&rsquo; characters in total. The cell in the bottom left corner must contain a cube. If there is more than one solution, output any of them.</p>