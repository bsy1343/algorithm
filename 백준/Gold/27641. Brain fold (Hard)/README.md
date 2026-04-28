# [Gold IV] Brain fold (Hard) - 27641

[문제 링크](https://www.acmicpc.net/problem/27641)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 1024 MB

### 통계

제출: 31, 정답: 11, 맞힌 사람: 9, 정답 비율: 37.500%

### 분류

수학

### 문제 설명

<p>Shandyna loves nerd sniping. (<a href="https://xkcd.com/356/">Relevant xkcd.</a> Don&rsquo;t worry, she only does it in safe enviroments.)</p>

<p>Last time she got five of them at once. When I saw them, they were still sitting around, trying to imagine a folded sheet of paper.</p>

<p>You have a rectangular piece of paper. You fold it in half several times. For each fold, you pick up one side and place it over the opposite side. There are four sides to pick, so there are four ways to perform each fold. (Two of the folds are horizontal and two are vertical.)</p>

<p>Once you finish the last fold, you pick a straight line and cut along it, through all layers of the folded paper. How many pieces of paper will you have at the end?</p>

### 입력

<p>The first line of the input file contains an integer <em>t</em> = 100 specifying the number of test cases. Each test case is preceded by a blank line.</p>

<p>Each test case consists of three lines.</p>

<p>The first line contains a number <em>n</em> (1 &le; <em>n</em> &le; 10<sup>5</sup>) denoting the number of folds.</p>

<p>The second line consists of <em>n</em> characters specifying the folds in the order they are applied: <code>T</code>, <code>B</code>, <code>L</code> and <code>R</code> represent folds for which you pick up the top, bottom, left, and right side, respectively. (Hence, <code>T</code> represents the fold that places the top side over the bottom side.)</p>

<p>The last line describes the cut. To make your life easier, the cut will never pass through a corner of the square. As it can be shown that the number of pieces does not depend on the exact points where the cut intersects the sides of the square, we can specify the cut simply by giving the labels of the two sides it intersects. For example, <code>TR</code> is a cut that intersects the top and the right side of the folded paper.</p>

### 출력

<p>For each test case, output a single line containing <em>x</em> modulo 10<sup>9</sup> + 7, where <em>x</em> is the number of paper pieces we&rsquo;re left with after cutting the paper.</p>

### 힌트

<p>The second test case is <span style="text-align:center;">shown</span> in the figure below.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/27641.%E2%80%85Brain%E2%80%85fold%E2%80%85(Hard)/6a63d006.png" data-original-src="https://upload.acmicpc.net/0c6c6da5-e505-4975-9ab3-0f35ea5f7568/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>