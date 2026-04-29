# [Gold II] 메이플스토리2 장례식 - 34004

[문제 링크](https://www.acmicpc.net/problem/34004)

### 성능 요약

시간 제한: 3 초, 메모리 제한: 1024 MB

### 통계

제출: 144, 정답: 72, 맞힌 사람: 58, 정답 비율: 60.417%

### 분류

3차원 기하학, 그리디 알고리즘, 기하학, 애드 혹

### 문제 설명

<p style="text-align: center;"><img alt="묘비와 비석 앞에서 춤을 추는 pichulia 의 메이플스토리2 캐릭터" src="%EB%B0%B1%EC%A4%80/Gold/34004.%E2%80%85%EB%A9%94%EC%9D%B4%ED%94%8C%EC%8A%A4%ED%86%A0%EB%A6%AC2%E2%80%85%EC%9E%A5%EB%A1%80%EC%8B%9D/5b4ca428.jpg" data-original-src="https://boja.mercury.kr/assets/problem/34004-1.jpg" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width:80%;display:block; margin-left: auto; margin-right: auto;"></p>

<blockquote>
<p>"안녕하세요. 무슨 축제인가요?"</p>

<p>"아니요. 메이플스토리2 장례식입니다."</p>
</blockquote>

<p>메이플스토리 게임의 흥행에 맞춰서 2015년 7월 7일에 야심 차게 오픈했던 메이플스토리2는 2025년 5월 29일 자로 서비스를 종료한다.</p>

<p>2차원에서 움직이던 메이플스토리와는 다르게, 메이플스토리2는 3차원에서 3D 캐릭터가 움직이며, 지형지물도 모두 3차원으로 이루어져 있다.</p>

<p>메이플스토리2의 열렬한 플레이어였던 pichulia는 나흘 뒤에 열릴 장례식을 준비하며 메이플스토리2의 특성에 맞게 3차원으로 묘비를 만들고자 한다. 우선 단위길이의 정육면체 블록을 $N$ 개 준비한 뒤, 각 블록의 면을 이어 붙여서 3D 묘비를 만들 것이다.</p>

<p>물론 묘비를 그냥 만들면 재미가 없기 때문에, 겉넓이가 최소가 되는 묘비를 만들어서 메이플스토리2의 넋을 기리고자 한다.</p>

<p>블록의 개수 $N$ 이 주어졌을 때, 이 $N$ 개의 블록으로 만들 수 있는 묘비의 겉넓이 최솟값을 구해보자.</p>

### 입력

<p>첫 번째 줄에는 테스트 케이스의 개수 $T$ 가 입력으로 주어진다. ($1 \le T \le 10$)</p>

<p>이후 $T$ 줄에 걸쳐 블록의 개수 $N$ 이 주어진다. ($1 \le N \le 1\,000\,000$)</p>

<p>입력으로 주어지는 모든 $N$들의 합은 $1\,000\,000$보다 작거나 같다.</p>

### 출력

<p>테스트 케이스마다 겉넓이의 최솟값을 $T$ 줄에 걸쳐 한 줄에 하나씩 출력한다.</p>

### 힌트

<p>$N$ 이 $6$ 일 때 겉넓이가 최소가 되는 모습.</p>

<p style="text-align: center;"><img alt="N이 6일 때 3x2x1 직육면체, 또는 2x2x1 위에 블록 두 개를 추가한 모습" src="%EB%B0%B1%EC%A4%80/Gold/34004.%E2%80%85%EB%A9%94%EC%9D%B4%ED%94%8C%EC%8A%A4%ED%86%A0%EB%A6%AC2%E2%80%85%EC%9E%A5%EB%A1%80%EC%8B%9D/a4f1b4df.png" data-original-src="https://boja.mercury.kr/assets/problem/34004-2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width:40%;display:block; margin-left: auto; margin-right: auto;"></p>

<p>$N$ 이 $19$ 일 때 겉넓이가 최소가 되는 모습.</p>

<p style="text-align: center;"><img alt="N이 19일 때 3x3x2 직육면체 위에 블록을 하나 추가한 모습" src="%EB%B0%B1%EC%A4%80/Gold/34004.%E2%80%85%EB%A9%94%EC%9D%B4%ED%94%8C%EC%8A%A4%ED%86%A0%EB%A6%AC2%E2%80%85%EC%9E%A5%EB%A1%80%EC%8B%9D/f60932c1.png" data-original-src="https://boja.mercury.kr/assets/problem/34004-3.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="max-width:40%;display:block; margin-left: auto; margin-right: auto;"></p>