# [Gold V] 피자 굽기 - 1756

[문제 링크](https://www.acmicpc.net/problem/1756)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 256 MB

### 통계

제출: 9642, 정답: 2801, 맞힌 사람: 2047, 정답 비율: 28.223%

### 분류

구현

### 문제 설명

<p>월드피자 원주 지점에서 N개의 피자 반죽을 오븐에 넣고 구우려고 한다. 그런데, 월드피자에서 만드는 피자 반죽은 지름이 제각각이다. 그런가하면, 월드피자에서 사용하는 오븐의 모양도 몹시 오묘하다. 이 오븐은 깊은 관처럼 생겼는데, 관의 지름이 깊이에 따라 들쭉날쭉하게 변한다. 아래는 오븐의 단면 예시이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/1756.%E2%80%85%ED%94%BC%EC%9E%90%E2%80%85%EA%B5%BD%EA%B8%B0/9cfd5914.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/1756.%E2%80%85%ED%94%BC%EC%9E%90%E2%80%85%EA%B5%BD%EA%B8%B0/9cfd5914.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/upload/201006/pizz1.PNG" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:157px; width:268px" /></p>

<p>피자 반죽은 완성되는 순서대로 오븐에 들어간다. 이렇게 N개의 피자가 오븐에 모두 들어가고 나면, 맨 위의 피자가 얼마나 깊이 들어가 있는지가 궁금하다. 이를 알아내는 프로그램을 작성하시오.</p>

### 입력

<p>첫째 줄에 오븐의 깊이 D와 피자 반죽의 개수 N이 공백을 사이에 두고 주어진다. (1 &le; D, N &le; 300,000) 둘째 줄에는 오븐의 최상단부터 시작하여 깊이에 따른 오븐의 지름이 차례대로 주어진다. 셋째 줄에는 피자 반죽이 완성되는 순서대로, 그 각각의 지름이 주어진다. 오븐의 지름이나 피자 반죽의 지름은 10억 이하의 자연수이다.</p>

### 출력

<p>첫째 줄에, 마지막 피자 반죽의&nbsp;위치를 출력한다. 오븐의 최상단이 1이고, 최하단 가장 깊은 곳이 D이 된다. 만약 피자가 모두 오븐에 들어가지 않는다면, 0을 출력한다.</p>

### 힌트

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/1756.%E2%80%85%ED%94%BC%EC%9E%90%E2%80%85%EA%B5%BD%EA%B8%B0/3bcf3d62.png" data-original-src="https://boja.mercury.kr/assets/problem/1756-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:156px; width:266px" /></p>