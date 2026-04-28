# [Silver III] 이런 반전이 - 11947

[문제 링크](https://www.acmicpc.net/problem/11947)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 3085, 정답: 993, 맞힌 사람: 836, 정답 비율: 35.349%

### 분류

수학

### 문제 설명

<p>하나의 양의 정수 n에 대해서 n의 &lsquo;반전&rsquo;인 F(n)은 다음과 같이 정의됩니다.</p>

<p>F(n) : n의 각 자리 수 a에 대해서 그 수를 (9 &ndash; a)로 바꾼 것</p>

<p>이때, 가장 큰 자리수의 유효숫자보다 앞에 등장하는 0들은 무시하는 것에 주의합니다. 따라서 9의 반전은 0이고, 91의 반전은 8, 124의 반전은 875, 990의 반전은 9가 됩니다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/11947.%E2%80%85%EC%9D%B4%EB%9F%B0%E2%80%85%EB%B0%98%EC%A0%84%EC%9D%B4/55084895.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/11947/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:153px; width:305px" /></p>

<p>여기서 어떤 수 n의 &lsquo;사랑스러움&rsquo;는 n과 n의 반전을 곱한 것으로 정의합니다. 입력으로 자연수 N이 주어지면, 1 이상 N 이하인 수들의 &lsquo;사랑스러움&rsquo; 중 최댓값을 출력하세요.</p>

### 입력

<p>첫째 줄에는 테스트 케이스의 개수를 나타내는 하나의 자연수 T가 주어집니다. 다음 T개의 각 줄에는 하나의 양의 정수 N이 주어집니다. (1 &le; N &le; 1,000,000,000)</p>

### 출력

<p>각 테스트 케이스에 해당하는 1 이상 N 이하인 수들의 &lsquo;사랑스러움&rsquo; 중 최댓값을 하나의 줄에 하나씩 출력하세요. 즉, k번째 테스트 케이스에 해당하는 답은 k번째 줄에 출력하시면 됩니다.</p>

### 힌트

<p>4 또는 5의 사랑스러움은 20이고 100의 사랑스러움은 89900입니다.</p>