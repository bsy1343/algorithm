# [Gold I] 작은 큐브러버 - 16116

[문제 링크](https://www.acmicpc.net/problem/16116)

### 성능 요약

시간 제한: 1 초 (추가 시간 없음), 메모리 제한: 512 MB

### 통계

제출: 354, 정답: 110, 맞힌 사람: 78, 정답 비율: 35.455%

### 분류

구현, 브루트포스 알고리즘

### 문제 설명

<p>작은 큐브러버는 작은 8개의 1&times;1&times;1 정육면체 조각을 갖고 있었어요. 각 조각에는 색이 칠해진 스티커가 붙어 있는 면이 세 개씩 있는데, 그 세 개의 면은 하나의 꼭짓점을 공유하고 있어요. 작은 큐브러버는 이 조각들을 잘 조립해서 각 면에 있는 4장의 스티커의 색이 서로 같고, 서로 다른 면에 있는 스티커는 서로 색이 다른 작은 2&times;2&times;2 큐브를 만들었어요. 작은 큐브러버는 작은 큐브를 매우 사랑했답니다.</p>

<p style="text-align:center;"><img alt="작은 큐브" src="%EB%B0%B1%EC%A4%80/Gold/16116.%E2%80%85%EC%9E%91%EC%9D%80%E2%80%85%ED%81%90%EB%B8%8C%EB%9F%AC%EB%B2%84/43b36d72.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16116.%E2%80%85%EC%9E%91%EC%9D%80%E2%80%85%ED%81%90%EB%B8%8C%EB%9F%AC%EB%B2%84/43b36d72.png" data-original-src="https://upload.acmicpc.net/adc6d5ae-b4c7-4079-8ba5-f2856fe70bbb/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:20%;" /></p>

<p>그런데 어느 날 작은 큐베러버가 날아와 작은 큐브에 붙어 있는 스티커들을 뒤섞고, 작은 큐브를 다시 8개의 조각으로 분해해 버렸어요. 스티커들을 뒤섞었다는 것은 임의의 두 개의 스티커를 떼어낸 다음 위치를 바꿔서 붙이는 것을 충분히 많이 반복했다는 뜻이에요.</p>

<p>작은 큐브러버는 너무 슬펐지만 용기를 내어, 작은 큐베러버를 <strong><em>삐-</em></strong>하고 8개의 조각들을 되찾았어요. 작은 큐브러버는 이 조각들을 조립해서 다시 작은 큐브를 만들고 싶어해요. 작은 큐브러버를 도와주세요!</p>

### 입력

<p>8개의 줄에 걸쳐 각 조각을 스티커가 붙어 있는 세 개의 면이 전부 보이도록 놓았을 때, 각 스티커에 칠해진 색을 윗면, 왼쪽 면, 오른쪽 면 순서로 읽은 결과가 주어진다. 각각의 색은 <code>B</code>(blue), <code>G</code>(green), <code>O</code>(orange), <code>R</code>(red), <code>W</code>(white), <code>Y</code>(yellow) 중 하나의 알파벳으로 표현된다. 예를 들어 위의 이미지의 중앙에 있는 조각은 <code>Y B R</code>로 주어진다.</p>

<p>입력에는 각각의 알파벳이 같은 개수만큼 등장함이 보장된다.</p>

### 출력

<p>조각을 조립해서 문제의 조건을 만족하는 작은 2&times;2&times;2 큐브를 만들 수 있을 경우 <code>YES</code>, 불가능하다면 <code>NO</code>를 출력한다.</p>

### 힌트

<p>첫 번째 예시의 조각들로는 아래와 같은 색 배치의 큐브를 만들 수 있다.</p>

<p style="text-align:center;"><img alt="첫 번째 예시의 큐브 색 배치" src="%EB%B0%B1%EC%A4%80/Gold/16116.%E2%80%85%EC%9E%91%EC%9D%80%E2%80%85%ED%81%90%EB%B8%8C%EB%9F%AC%EB%B2%84/f4034f92.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/16116.%E2%80%85%EC%9E%91%EC%9D%80%E2%80%85%ED%81%90%EB%B8%8C%EB%9F%AC%EB%B2%84/f4034f92.png" data-original-src="https://upload.acmicpc.net/57224c68-a31f-4b25-bafe-ca3d42e551f7/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width:30%;" /></p>