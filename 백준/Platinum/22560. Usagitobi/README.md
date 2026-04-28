# [Platinum II] Usagitobi - 22560

[문제 링크](https://www.acmicpc.net/problem/22560)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 22, 정답: 5, 맞힌 사람: 5, 정답 비율: 41.667%

### 분류

유클리드 호제법, 기하학, 선형대수학, 수학, 정수론

### 문제 설명

<p><i>m</i>&nbsp;&times;&nbsp;<i>n</i>&nbsp;マスの盤がある.&nbsp;<i>i</i>&nbsp;行<i>j</i>&nbsp;列のマスを(<i>i</i>,&nbsp;<i>j</i>) (0 &le;&nbsp;<i>i</i>&nbsp;&lt;&nbsp;<i>m</i>, 0 &le;&nbsp;<i>j</i>&nbsp;&lt;&nbsp;<i>n</i>) で表す.</p>

<p>うさぎは(<i>x</i>,&nbsp;<i>y</i>) にいるとき, ((<i>x</i>&nbsp;+&nbsp;<i>a</i>) mod&nbsp;<i>m</i>, (<i>y</i>&nbsp;+&nbsp;<i>b</i>) mod&nbsp;<i>n</i>) または((<i>x</i>&nbsp;+&nbsp;<i>c</i>) mod&nbsp;<i>m</i>, (<i>y</i>&nbsp;+&nbsp;<i>d</i>) mod&nbsp;<i>n</i>) へ跳ぶことができる.</p>

<p>いま, うさぎが(0, 0) にいる. 一度跳び立ったマスへ再び行くことはできないとするとき, うさぎは最大何回跳ぶことができるか.</p>

### 입력

<p>入力は一行に<i>m</i>,&nbsp;<i>n</i>,&nbsp;<i>a</i>,&nbsp;<i>b</i>,&nbsp;<i>c</i>,&nbsp;<i>d</i>&nbsp;がスペース区切りで与えられる. 1 &le;&nbsp;<i>m</i>,&nbsp;<i>n</i>,&nbsp;<i>a</i>,&nbsp;<i>b</i>,&nbsp;<i>c</i>,&nbsp;<i>d</i>&nbsp;&le; 100 000</p>

### 출력

<p>うさぎが跳べる最大回数を一行に出力せよ.</p>