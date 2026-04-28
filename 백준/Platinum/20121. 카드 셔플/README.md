# [Platinum IV] 카드 셔플 - 20121

[문제 링크](https://www.acmicpc.net/problem/20121)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 256 MB

### 통계

제출: 210, 정답: 63, 맞힌 사람: 55, 정답 비율: 35.032%

### 분류

수학, 정수론, 해 구성하기

### 문제 설명

<p>마술사 견습생 진수에게는 <em>N</em> (<em>N</em>은 홀수) 장의 카드가 있고 진수는 두 가지 셔플을 할 줄 안다.</p>

<p>첫 번째 셔플을 X-셔플이라고 하고 셔플을 하는 방법은 다음과 같다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/8ac7f509-d217-47ef-980a-686b7eae7511/-/preview/" /></p>

<p>앞 부분의 <em>(N+1)/2</em> 개와 뒷 부분 <em>(N-1)/2</em> 개로 나눈다.</p>

<p>뒷 부분을 순서대로 앞 부분 사이사이에 끼워넣는다.</p>

<p>두 번째 셔플을 Y-셔플이라고 하고 셔플을 하는 방법은 다음과 같다.</p>

<p style="text-align: center;"><img alt="" src="https://upload.acmicpc.net/b2230350-6c44-449c-8b7b-3aaf7c998a34/-/preview/" /></p>

<p>앞 부분의 <em>(N-1)/2</em> 개와 뒷 부분 <em>(N+1)/2</em> 개로 나눈다.</p>

<p>앞 부분을 순서대로 뒷 부분 사이사이에 끼워넣는다.</p>

<p>처음 카드팩을 뜯으면 카드는 앞 부분 부터 차례대로 1번, 2번, ..., <em>N</em>번 카드가 순서대로 있다.</p>

<p>진수는 위의 두 셔플을 사용하여 <em>A</em>번 카드를 앞에서 <em>B</em>번째로 보내는 마술을 하고자 한다.</p>

<p>하지만 카드가 많아질수록 머리가 복잡하여 힘들어 고민하고 있다. 진수를 도와 최소 셔플 방법을 구하자.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스 개수 <em>T</em> (1 &le;&nbsp;<em>T</em> &le; 100) 가 주어진다.</p>

<p>다음 <em>T</em>개 줄에는 각 줄 마다 <em>N</em>, <em>A</em>, <em>B</em> (3 &le; <em>N</em> &lt; 10<sup>9</sup>, 1 &le; <em>A</em>, <em>B</em> &le;&nbsp;<em>N</em>, <em>A</em> &ne;&nbsp;<em>B</em>, <em>N</em>은 홀수) 가 주어진다.</p>

<p>항상 방법이 존재하는 입력만 주어진다.</p>

### 출력

<p><em>i</em>번째 줄에는 <em>i</em>번째 테스트 케이스의 최소 횟수로 셔플하는 방법을 나타내는 문자열 <em>S</em> = <em>s<sub>1</sub>s</em><sub><em>2</em> ...&nbsp;</sub><em>s<sub>K</sub></em> (<em>s<sub>j</sub></em> = &#39;<code>X</code>&#39; or &#39;<code>Y</code>&#39;) 를 출력한다.</p>

<p><em>s<sub>j</sub></em>는 <em>j</em>번째 셔플이 X-셔플인지 Y-셔플인지를 의미한다.</p>

<p>방법이 여러 가지인 경우 그 중 하나만 출력한다.</p>