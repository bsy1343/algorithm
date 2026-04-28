# [Silver I] Square Route - 22683

[문제 링크](https://www.acmicpc.net/problem/22683)

### 성능 요약

시간 제한: 8 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 24, 정답: 23, 맞힌 사람: 16, 정답 비율: 94.118%

### 분류

누적 합

### 문제 설명

<p>このたび新しい豪邸を建てることを決めた大富豪の品田氏は，どの街に新邸を建てようかと悩んでいる．実は，品田氏は正方形がとても好きという変わった人物であり，そのため少しでも正方形の多い街に住みたいと思っている．</p>

<p>品田氏は，碁盤目状に道路の整備された街の一覧を手に入れて，それぞれの街について，道路により形作られる正方形の個数を数えることにした．ところが，道と道の間隔は一定とは限らないため，手作業で正方形を数えるのは大変である．そこであなたには，碁盤目状の道路の情報が与えられたときに，正方形の個数を数えるプログラムを書いて欲しい．</p>

### 입력

<p>入力は複数のデータセットから構成されており，各データセットは以下のような構成になっている．</p>

<pre>
<i>N</i>&nbsp;<i>M</i>
<i>h</i><sub>1</sub>
<i>h</i><sub>2</sub>
...
<i>h</i><sub><i>N</i></sub>
<i>w</i><sub>1</sub>
<i>w</i><sub>2</sub>
...
<i>w</i><sub><i>M</i></sub>
</pre>

<p>1 行目には 2 つの正の整数&nbsp;<i>N</i>,&nbsp;<i>M</i>&nbsp;(1 ≦&nbsp;<i>N</i>,&nbsp;<i>M</i>&nbsp;≦ 1500) が与えられる．続く&nbsp;<i>N</i>&nbsp;行&nbsp;<i>h</i><sub>1</sub>,&nbsp;<i>h</i><sub>2</sub>, ...,&nbsp;<i>h</i><sub><i>N</i></sub>&nbsp;(1 ≦&nbsp;<i>h</i><sub><i>i</i></sub>&nbsp;≦ 1000）は，道路と道路の南北方向の間隔を表す．ここで&nbsp;<i>h</i><sub><i>i</i></sub>&nbsp;は北から&nbsp;<i>i</i>&nbsp;番目の道路と北から&nbsp;<i>i</i>&nbsp;+ 1 番目の道路の間隔である．同様に，続く&nbsp;<i>M</i>&nbsp;行&nbsp;<i>w</i><sub>1</sub>, ...,&nbsp;<i>w</i><sub><i>M</i></sub>&nbsp;(1 ≦&nbsp;<i>w</i><sub><i>i</i></sub>&nbsp;≦ 1000）は，道路と道路の東西方向の間隔を表す．ここで&nbsp;<i>w</i><sub><i>i</i></sub>&nbsp;は西から&nbsp;<i>i</i>&nbsp;番目の道路と西から&nbsp;<i>i</i>&nbsp;+ 1 番目の道路の間隔である．道路自体の幅は十分細いため考慮する必要はない．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22683.%E2%80%85Square%E2%80%85Route/15f3a529.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/22683.%E2%80%85Square%E2%80%85Route/15f3a529.png" data-original-src="https://upload.acmicpc.net/92f9f81e-2d6d-44dc-99d4-5e4401894fef/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 230px; height: 219px;" /></p>

<p style="text-align: center;">図 D-1: 最初のデータセット</p>

<p><i>N</i>&nbsp;=&nbsp;<i>M</i>&nbsp;= 0 は入力の終端を示しており，データセットには含めない．</p>

### 출력

<p>各データセットに対して，正方形の個数を 1 行に出力しなさい．たとえば，Sample Input の最初のデータセットにおいては，以下のとおり 6 個の正方形を含むので，このデータセットに対する出力は 6 となる．</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/22683.%E2%80%85Square%E2%80%85Route/82464963.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/22683.%E2%80%85Square%E2%80%85Route/82464963.png" data-original-src="https://upload.acmicpc.net/8f204bd9-d939-4331-93b7-c0bbe5ed3b03/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 336px; height: 232px;" /></p>

<p style="text-align: center;">図 D-2: 最初のデータセットに含まれる正方形</p>