# [Gold III] 회식구호 - 16158

[문제 링크](https://www.acmicpc.net/problem/16158)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 243, 정답: 88, 맞힌 사람: 76, 정답 비율: 45.238%

### 분류

수학, 스위핑

### 문제 설명

<p>진영이는 동아리의 회장이 되어 회식자리에서&nbsp;누구보다 큰 목소리로 자신의&nbsp;각오를&nbsp;보여주고 싶었다. 하지만 구호 P!D!A! Oh! P!D!A! Oh!를 외쳤을 때, 동아리원들마다 생각하는 적절한 목소리 크기가 다르기 때문에,&nbsp;어떤 동아리원들은 진영이의 목소리가 너무 작다고 생각할 수도 있고 반대로&nbsp;시끄럽다고 생각하는 동아리원들도 있을 것이다. 진영이는&nbsp;결국 <em>X&nbsp;</em>이상의 만족도를 갖는 동아리원이 적어도 <em>K</em>명 이상인 목소리 크기&nbsp;중&nbsp;가장 작은 크기로 외치려고 한다. 진영이의 목소리 크기를 <em>D</em>. 동아리원 <em>i</em>가 생각하는&nbsp;적절한 목소리 크기를&nbsp;<em>P<sub>i</sub></em>라고 할 때, 동아리원 <em>i</em>의 만족도는 아래와 같이 정의된다.</p>

<p><meta charset="utf-8" /></p>

<p dir="ltr" style="text-align: center;">만족도 = {(<em>P<sub>i</sub></em> - |<em>P<sub>i</sub></em> - <em>D</em>|) / <em>P<sub>i</sub></em>}&nbsp;* 100</p>

<p><em>X</em>이상의 만족도를 갖는 동아리원이 적어도 <em>K</em>명 이상인 목소리 크기&nbsp;중&nbsp;가장 작은 크기를 구하는 프로그램을 작성하라.</p>

### 입력

<p>첫째 줄에 정수 <em>N</em>(1 &le; <em>N</em> &le; 10<sup>5</sup>), <em>X</em>(1 &le; <em>X</em> &le; 100), <em>K</em>(1 &le; <em>K</em> &le; <em>N</em>)가&nbsp;공백으로 구분되어 주어진다.</p>

<p>둘째 줄에 동아리원 <em>i</em>가 생각하는 적절한 목소리 크기를 나타내는 <em>N</em>개의&nbsp;정수&nbsp;<em>P<sub>i</sub></em>(1 &le; <em>P<sub>i</sub></em> &le; 10<sup><span style="font-size: 10.8333px;">5</span></sup>)가 공백으로 구분되어 주어진다.</p>

### 출력

<p><em>X&nbsp;</em>이상의 만족도를 갖는 동아리원이 적어도 <em>K</em>명 이상인 목소리 크기&nbsp;중&nbsp;가장 작은 크기를 <em>ANS</em>라고 할 때, <i>ANS</i>가 정수라면 정수 값을 출력하고, 그렇지 않다면 기약분수 <code>p/q</code>의 형태로 출력하라. 만약 그러한 <em>ANS</em>가 존재하지 않는 경우 -1을 출력하라.</p>