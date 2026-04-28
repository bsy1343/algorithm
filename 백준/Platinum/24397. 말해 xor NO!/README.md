# [Platinum III] 말해 xor NO! - 24397

[문제 링크](https://www.acmicpc.net/problem/24397)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 214, 정답: 107, 맞힌 사람: 89, 정답 비율: 53.293%

### 분류

자료 구조, 트리, 비트마스킹, 트라이

### 문제 설명

<p>중앙대학교의 자랑스러운 청룡 푸앙이는 요즘 즐겨 듣는 노래가 있다. 〈Show me the 중앙〉에 나온 &#39;말해 xor NO!&#39; 라는 노래이다. 노래에 심취한 푸앙이는 노래의 제목대로 &#39;말해 xor NO!&#39;를 계산하기 위해 <em>N</em>장의 &#39;말해&#39; 카드와 <em>M</em>장의 &#39;NO!&#39; 카드를 만들었다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/24397.%E2%80%85%EB%A7%90%ED%95%B4%E2%80%85xor%E2%80%85NO!/8aec4989.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/24397.%E2%80%85%EB%A7%90%ED%95%B4%E2%80%85xor%E2%80%85NO!/8aec4989.png" data-original-src="https://upload.acmicpc.net/fda9939c-99d3-48a2-a92e-70e04aa9f1cd/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>정수 <em>n</em>이 쓰여 있는 &#39;말해&#39; 카드와 <em>m</em>이 쓰여 있는 &#39;NO!&#39; 카드를 하나씩 뽑았을 때, 두 카드에 대한 &#39;말해 xor NO!&#39; 연산의 값은 <em>n</em> xor <em>m</em>으로 정의한다.</p>

<p>올해 <em>K</em>살이 되는 푸앙이는 &#39;말해 xor NO!&#39; 연산을 한 결과가 자신의 나이보다 작은 경우의 수가 얼마나 있는지 궁금해졌다. 푸앙이를 위해 경우의 수를 계산하는 프로그램을 만들어주자!</p>

### 입력

<p>첫째 줄에 &#39;말해&#39; 카드의 개수 <em>N</em>(1 &le; <em>N</em> &le;&nbsp;100,000)과 &#39;NO!&#39; 카드의 개수 <em>M</em>(1 &le; <em>M</em> &le;&nbsp;100,000), 푸앙이의 나이 <em>K</em>(​1 &le;<em> K </em>&le; 10<sup>9</sup>)가&nbsp;주어진다. 다음 줄에는 &#39;말해&#39; 카드에 적힌 수<em>&nbsp;a<sub>1</sub></em>, <em>a<sub>2</sub></em>, ..., <em>a<sub>N</sub></em>이 공백으로 구분되어 주어진다. 마지막 줄에는 &#39;NO!&#39; 카드에 적힌 수<em>&nbsp;b<sub>1</sub></em>, <em>b<sub>2</sub></em>, ..., <em>b<sub>M</sub></em>이 공백으로 구분되어 주어진다.<em> </em>(1&nbsp;&le;<em> a<sub>i</sub>,&nbsp;b<sub>i&nbsp;</sub></em>&le;&nbsp;10<sup>9</sup>)</p>

### 출력

<p>첫째 줄에 bitwise xor 연산을 한 값이&nbsp;K보다 작은&nbsp;카드 쌍의 개수를 출력한다.</p>

### 힌트

<p>xor 연산의 정의는 <a href="https://en.wikipedia.org/wiki/Bitwise_operation#XOR">여기</a>에서 확인할 수 있다.</p>