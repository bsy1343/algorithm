# [Gold I] 클레어와 물약 - 20119

[문제 링크](https://www.acmicpc.net/problem/20119)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 1714, 정답: 531, 맞힌 사람: 365, 정답 비율: 30.190%

### 분류

그래프 이론, 그래프 탐색, 방향 비순환 그래프, 위상 정렬

### 문제 설명

<p>세상에는 <em>N</em>종류의 물약이 있고 클레어는 <em>M</em>개의 레시피를 알고있다.</p>

<p>레시피는 (<em>x<sub>1</sub></em>, <em>x</em><sub><em>2</em>,</sub> ..., <em>x<sub>k</sub></em>) &rarr;&nbsp;<em>r</em> 형태로 표현할 수 있고 <em>x<sub>1</sub></em>번, <em>x<sub>2</sub></em>번 ..., <em>x<sub>k</sub></em>번 물약을 모두 섞어서 <em>r</em>번 물약을 만들 수 있다는 뜻이다.</p>

<p>현재 클레어에게는&nbsp;<em>y<sub>1</sub></em>번, <em>y<sub>2</sub></em>번,&nbsp;..., <em>y<sub>L</sub></em>번&nbsp;물약만 있다.&nbsp;만들 수 있는 물약들을 전부 알아내주자.</p>

<p>클레어가 가지고 있는 각 종류의 물약의 양은 무한대라고 가정하자.</p>

### 입력

<p>첫 번째 줄에는 세상에 존재하는 물약의 종류의 수 <em>N</em> (3 &le; <em>N</em> &le;&nbsp;200,000) 과 클레어가 알고 있는 레시피의 개수 M (1 &le;&nbsp;<em>M</em>&nbsp;&le; 200,000) 이 주어진다.</p>

<p>다음&nbsp;<em>M</em>개의 줄에는 각각의 줄마다 레시피의 정보&nbsp;<em>k<sub>i</sub></em>,&nbsp;<em>x<sub>i1</sub></em>,&nbsp;<em>x</em><sub><em>i2</em>, ...,&nbsp;</sub><em>x<sub>ik<sub>i</sub></sub></em>,&nbsp;<em>r<sub>i</sub></em>&nbsp;(1 &le;&nbsp;<em>k<sub>i</sub></em>&nbsp;&lt; N, 1 &le;&nbsp;<em>x<sub>ij</sub></em>,&nbsp;<em>r<sub>i</sub></em>&nbsp;&le;&nbsp;<em>N</em>,&nbsp;<em>x<sub>ij</sub></em>&nbsp;&ne;&nbsp;<em>r<sub>i</sub></em>) 가 주어지며 이는 (<em>x<sub>i1</sub></em>,&nbsp;<em>x</em><sub><em>i2</em>, ...,&nbsp;</sub><em>x<sub>ik<sub>i</sub></sub></em>) &rarr;&nbsp;<em>r<sub>i</sub></em>&nbsp;형태의 레시피를 의미한다.</p>

<p><em>M+2</em>&nbsp;번째 줄에는 현재 클레어가 가지고 있는 물약 종류의 수&nbsp;<em>L</em>&nbsp;(1 &le;&nbsp;<em>L</em>&nbsp;&lt; N) 이 주어진다.</p>

<p><em>M+3</em>&nbsp;번째 줄에는&nbsp;<em>y<sub>1</sub></em>,&nbsp;<em>y<sub>2</sub></em>, ...,&nbsp;<em>y<sub>L&nbsp;</sub></em>(1 &le;&nbsp;<em>y<sub>i</sub></em>&nbsp;&le;&nbsp;<em>N</em>) 이 주어진다.</p>

<p>모든 <em>k<sub>i</sub></em>의 합은 400,000을 넘지 않는다.</p>

### 출력

<p>첫 번째 줄에 클레어가 만들 수 있는 물약의 개수를 출력한다.</p>

<p>두 번째 줄에는 만들 수 있는 물약의 번호를 오름차순으로 출력한다.</p>