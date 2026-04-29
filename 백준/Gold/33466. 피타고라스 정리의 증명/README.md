# [Gold V] 피타고라스 정리의 증명 - 33466

[문제 링크](https://www.acmicpc.net/problem/33466)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 712, 정답: 251, 맞힌 사람: 184, 정답 비율: 40.889%

### 분류

수학, 정수론

### 문제 설명

<p>피타고라스 정리는 다음과 같다.</p>

<blockquote>
<p>직각삼각형의 빗변의 길이가 $c$, 나머지 두 변의 길이가 각각 $a$, $b$라 할 때, $a^2+b^2=c^2$을 만족한다.</p>
</blockquote>

<p>피타고라스 정리의 증명은 따로 책이 있을 정도로 다양한 방법이 있다. 현민이는 이 증명법 중 근본은 피타고라스가 했다고 알려진 아래 방법이라고 주장한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/33466.%E2%80%85%ED%94%BC%ED%83%80%EA%B3%A0%EB%9D%BC%EC%8A%A4%E2%80%85%EC%A0%95%EB%A6%AC%EC%9D%98%E2%80%85%EC%A6%9D%EB%AA%85/21dd3290.png" data-original-src="https://boja.mercury.kr/assets/problem/33466-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 320px; max-width: 100%;"></p>

<p>옆에서 이를 듣던 민재는 피타고라스에 푹 빠진 현민이를 구출하기 위해 다음과 같이 물어봤다.</p>

<blockquote>
<p>“위 그림에서 $a$, $b$가 $N$ 이하의 양의 정수이면서, 노란색 정사각형의 넓이가 파란색 삼각형 하나 넓이의 정수배가 되려면 어떤 조건을 만족해야 해?”</p>
</blockquote>

<p>현민이를 도와 답을 찾아 피타고라스로부터 구출해 주자.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 $T(1\le T\le 10^6)$가 주어진다.</p>

<p>두 번째 줄부터 $T$줄에 걸쳐 각 테스트 케이스 별 $N(1\le N\le 10^{18})$이 한 줄에 한 개씩 주어진다.</p>

### 출력

<p>첫 번째 줄부터 $T$줄에 걸쳐 각 테스트 케이스 별로 조건을 만족하는 순서쌍 $\left( a,b \right)$의 개수를 한 줄에 한 개씩 출력한다.</p>