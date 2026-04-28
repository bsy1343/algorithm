# [Gold V] Fractal Cake - 7498

[문제 링크](https://www.acmicpc.net/problem/7498)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 146, 정답: 11, 맞힌 사람: 5, 정답 비율: 6.579%

### 분류

구현, 재귀

### 문제 설명

<p>Fyodor celebrates his birthday today. Before the guests come he decorates a cake with chocolate cream in a special way. At the beginning cake looks like a square divided into&nbsp;<strong>4</strong>&nbsp;equal white square parts. Fyodor calls fractalization the following sequence of actions. All the little squares of cake get united into groups of&nbsp;<strong>2</strong>x<strong>2</strong>&nbsp;so that there are no ungrouped fragments. After that each small square is divided into&nbsp;<strong>4</strong>&nbsp;equal squares so that group of&nbsp;<strong>2</strong>x<strong>2</strong>&nbsp;becomes a group of&nbsp;<strong>4</strong>x<strong>4</strong>. As the last action&nbsp;<strong>4</strong>&nbsp;squares in the middle of each group are filled with chocolate. Fyodor does not stop at one fractalization and repeats it&nbsp;<strong>N</strong>&nbsp;times, even when he has to use a microscope. Illustration below shows the initial cake, first fractalization result, and the cake after the fifth fractalization:</p>

<p style="text-align:center"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7498.%E2%80%85Fractal%E2%80%85Cake/c7aee2de.jpg" data-original-src="http://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/7498/1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:48px; width:234px" /></p>

<p>Now Fyodor wants to cut pieces of cake with beautiful patterns for guests, but it is difficult to assess beauty of a piece looking at the whole cake. Fyodor wants a program that will quickly show the pattern of rectangular part of the cake.</p>

### 입력

<p>Single line at the input contains five non-negative integers:&nbsp;<strong>N</strong>,&nbsp;<strong>R<sub>1</sub></strong>,&nbsp;<strong>R<sub>2</sub></strong>,&nbsp;<strong>C<sub>1</sub></strong>,&nbsp;<strong>C<sub>2</sub></strong>.&nbsp;<strong>N</strong>&nbsp;&ndash; the number of fractalization iterations (<strong>N</strong>&nbsp;&lt;&nbsp;<strong>20</strong>),&nbsp;<strong>R<sub>1</sub></strong>&nbsp;and&nbsp;<strong>R<sub>2</sub></strong>&nbsp;&ndash; first and last rows,&nbsp;<strong>C<sub>1</sub></strong>&nbsp;and&nbsp;<strong>C<sub>2</sub></strong>&nbsp;&ndash; first and last columns of the part. Following restrictions are also met:&nbsp;<strong>R<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>R<sub>2</sub></strong>,&nbsp;<strong>C<sub>1</sub></strong>&nbsp;&le;&nbsp;<strong>C<sub>2</sub></strong>;&nbsp;<strong>0</strong>&nbsp;&le;&nbsp;<strong>R<sub>2</sub></strong>&nbsp;-&nbsp;<strong>R<sub>1</sub></strong>,&nbsp;<strong>C<sub>2</sub></strong>&nbsp;-&nbsp;<strong>C<sub>1</sub></strong>&nbsp;&lt;&nbsp;<strong>100</strong>;&nbsp;<strong>0</strong>&nbsp;&le;&nbsp;<strong>R<sub>1</sub></strong>,&nbsp;<strong>R<sub>2</sub></strong>,&nbsp;<strong>C<sub>1</sub></strong>,&nbsp;<strong>C<sub>2</sub></strong>&nbsp;&lt;&nbsp;<strong>2</strong><strong>N</strong>&nbsp;+&nbsp;<strong>1</strong>.</p>

### 출력

<p>Output should contain&nbsp;<strong>R<sub>2</sub></strong>&nbsp;-&nbsp;<strong>R<sub>1</sub></strong>&nbsp;+&nbsp;<strong>1</strong>&nbsp;lines each containing&nbsp;<strong>C<sub>2</sub></strong>&nbsp;-&nbsp;<strong>C<sub>1</sub></strong>&nbsp;+&nbsp;<strong>1</strong>&nbsp;characters. Each symbol corresponds to a square and should be&nbsp;<strong>1</strong>&nbsp;in case it&rsquo;s filled with chocolate and&nbsp;<strong>0</strong>&nbsp;otherwise.</p>