# [Bronze III] 수학은 체육과목 입니다 - 15894

[문제 링크](https://www.acmicpc.net/problem/15894)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 63642, 정답: 34569, 맞힌 사람: 32100, 정답 비율: 54.571%

### 분류

사칙연산, 수학

### 문제 설명

<p>성원이는 수학을 정말 못 하는 고등학생이다. 수학을 못하는 대신 근성과 팔 힘이 뛰어난 성원이는 수학 시험에서 수학 지식을 사용하지 않고 근성과 체력을 사용해 문제를 푼다. 지난 시험에서는 아래 사진에 나와있는 문제를 근성과 체력을 사용해 열심히 풀었지만 사진에서 볼 수 있듯이 틀려버리고 말았다!</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/15894.%E2%80%85%EC%88%98%ED%95%99%EC%9D%80%E2%80%85%EC%B2%B4%EC%9C%A1%EA%B3%BC%EB%AA%A9%E2%80%85%EC%9E%85%EB%8B%88%EB%8B%A4/6e3024dc.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/15894.%E2%80%85%EC%88%98%ED%95%99%EC%9D%80%E2%80%85%EC%B2%B4%EC%9C%A1%EA%B3%BC%EB%AA%A9%E2%80%85%EC%9E%85%EB%8B%88%EB%8B%A4/6e3024dc.png" data-original-src="https://upload.acmicpc.net/8f346caa-48f9-4e98-afcd-1aedbce594f4/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 400px; height: 552px;" /></p>

<p>결국 이 문제는 틀려버렸지만 성원이는 여전히 자신의 체력에 강한 자신감을 갖고 있다. 어떤 어려운 문제가 나와도 이런 식으로 근성과 체력을 사용하면 다 풀 수 있으니 이 방법은 최고의 방법이라고 생각하고 있다.</p>

<p>성원이의 친구 형석이는 근성과 체력으로 수학 문제를 푸는 것은 굉장히 무식한 방법이라고 생각한다. 형석이는 수학을 공부하면 문제를 훨씬 빨리 풀 수 있다는 것을 알려주기 위해 위 사진에 나와있는 문제를 갖고 성원이와 퀴즈 내기를 하기로 했다. 위 사진의 문제를 다시 정리하면 아래와 같다.</p>

<blockquote>
<p>&quot;한 변의 길이가 1인 정사각형을 아래 그림과 같이 겹치지 않게 빈틈없이 계속 붙여 나간다. 가장 아랫부분의 정사각형이 n개가 되었을 때, 실선으로 이루어진 도형의 둘레의 길이를 구하시오.&quot;</p>
</blockquote>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Bronze/15894.%E2%80%85%EC%88%98%ED%95%99%EC%9D%80%E2%80%85%EC%B2%B4%EC%9C%A1%EA%B3%BC%EB%AA%A9%E2%80%85%EC%9E%85%EB%8B%88%EB%8B%A4/9b74b008.png" data-original-src="%EB%B0%B1%EC%A4%80/Bronze/15894.%E2%80%85%EC%88%98%ED%95%99%EC%9D%80%E2%80%85%EC%B2%B4%EC%9C%A1%EA%B3%BC%EB%AA%A9%E2%80%85%EC%9E%85%EB%8B%88%EB%8B%A4/9b74b008.png" data-original-src="https://upload.acmicpc.net/5b7d2e93-e324-40c8-a274-0104750d6c43/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" /></p>

<p>가장 아랫부분의 정사각형 개수가 주어지면 그에 해당하는 답을 출력하는 프로그램을 만들어 형석이를 도와주자!</p>

### 입력

<p>첫 번째 줄에 가장 아랫부분의 정사각형 개수 n이 주어진다. (1 &le; n &le; 10<sup>9</sup>)</p>

### 출력

<p>첫 번째 줄에 형석이가 말해야 하는 답을 출력한다.</p>