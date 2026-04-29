# [Gold V] KCPC 스티커 만들기 - 35162

[문제 링크](https://www.acmicpc.net/problem/35162)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 1024 MB (추가 메모리 없음)

### 통계

제출: 186, 정답: 67, 맞힌 사람: 58, 정답 비율: 57.426%

### 분류

기하학, 많은 조건 분기, 애드 혹, 해 구성하기

### 문제 설명

<p>동우는 이번 KCPC를 맞이하여 <strong>KCPC 스티커</strong>를 만들고자 한다.</p>

<p><strong>KCPC 스티커</strong>를 만들기 위해 동우는 아래 사진처럼 생긴 <code>K</code>, <code>C</code>, <code>P</code> 글자 스티커가 필요하다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35162.%E2%80%85KCPC%E2%80%85%EC%8A%A4%ED%8B%B0%EC%BB%A4%E2%80%85%EB%A7%8C%EB%93%A4%EA%B8%B0/487b1c76.png" data-original-src="https://boja.mercury.kr/assets/problem/35162-1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; max-width: 100%;"></p>

<p>그동안 동우는 ◯CPC에 상당히 많이 참여했기 때문에 <code>C</code>, <code>P</code> 글자 스티커는 많지만, 동우가 참여하거나 운영한 KCPC는 2022년부터 2024년 총 $3$번 뿐이므로 <code>K</code> 글자 스티커는 몇 개 없다.</p>

<p>동우는 본인이 가진 스티커를 모두 평면에 잘 배치하여 <strong>KCPC 스티커</strong>를 만들고자 한다. <strong>KCPC 스티커</strong>의 각 문자는 서로 겹치면 안 되며, 스티커 내에서 문자를 이루는 모든 선분의 끝점은 다른 선분과 닿아 있어야 한다. 즉, 구체적으로 다음 조건을 만족해야 한다.</p>

<ul>
<li>서로 다른 선분은 교차해서는 안 된다. 단, 끝점이 닿아 있는 경우 교차하지 않은 것으로 생각한다.</li>
<li>두 개의 문자가 한 선분을 공유해서는 안 된다.</li>
<li>아래 사진의 파란 점은 다른 스티커의 선분에 닿아 있어야 한다.
	<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35162.%E2%80%85KCPC%E2%80%85%EC%8A%A4%ED%8B%B0%EC%BB%A4%E2%80%85%EB%A7%8C%EB%93%A4%EA%B8%B0/ab8d63c1.png" data-original-src="https://boja.mercury.kr/assets/problem/35162-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; max-width: 100%;"></p>
</li>
<li>문자를 회전이나 뒤집는 행위는 자유롭게 허용된다.</li>
</ul>

<p>아래 그림은 가능한 예시들이다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35162.%E2%80%85KCPC%E2%80%85%EC%8A%A4%ED%8B%B0%EC%BB%A4%E2%80%85%EB%A7%8C%EB%93%A4%EA%B8%B0/a3b45bf3.png" data-original-src="https://boja.mercury.kr/assets/problem/35162-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; max-width: 100%;"></p>

<p>아래 그림은 불가능한 예시들이다. 첫 번째의 경우 두 개의 문자가 한 선분을 공유하고, 두 번째의 경우 다른 선분과 닿지 않은 끝점이 있으며, 세 번째의 경우 선분이 교차한다.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/35162.%E2%80%85KCPC%E2%80%85%EC%8A%A4%ED%8B%B0%EC%BB%A4%E2%80%85%EB%A7%8C%EB%93%A4%EA%B8%B0/8ebce7d3.png" data-original-src="https://boja.mercury.kr/assets/problem/35162-4.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 300px; max-width: 100%;"></p>

<p>동우가 가진 <code>K</code>, <code>C</code>, <code>P</code> 글자 스티커의 개수가 주어질 때, 조건을 만족하는 <strong>KCPC 스티커</strong>를 만들 수 있는지 판단해 보자.</p>

### 입력

<p>첫 번째 줄에 테스트 케이스의 개수 $T(1\le T\le 40\, 803)$가 주어진다.</p>

<p>두 번째 줄부터 $T$줄에 걸쳐 각 테스트 케이스 별로 한 줄에 동우가 가진 <code>K</code>, <code>C</code>, <code>P</code> 글자 스티커의 개수 $K,C,P(0\le K\le 3$; $0\le C,P\le 100$; $1\le K+C+P)$가 공백으로 구분되어 주어진다.</p>

<p>같은 테스트 케이스가 여러 번 주어지지는 않는다.</p>

### 출력

<p>첫 번째 줄부터 $T$줄에 걸쳐 각 테스트 케이스 별로 가능하면 <span style="color:#e74c3c;"><code>Y</code></span>, 불가능하면 <span style="color:#e74c3c;"><code>N</code></span>을 출력한다.</p>