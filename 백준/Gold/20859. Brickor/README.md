# [Gold V] Brickor - 20859

[문제 링크](https://www.acmicpc.net/problem/20859)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 17, 정답: 15, 맞힌 사람: 11, 정답 비율: 91.667%

### 분류

그래프 이론, 그래프 탐색, 너비 우선 탐색

### 문제 설명

<p>Karin har hittat p&aring; ett ensamspel som spelas med Othello-brickor, vilka &auml;r svarta p&aring; ena sidan och vita p&aring; andra sidan. Hon l&auml;gger ut en rad med brickor, som var och en kan vara svart eller vit. M&aring;let &auml;r att f&aring; alla brickor att ha den vita sidan upp&aring;t.</p>

<p>Ett &quot;drag&quot; &auml;r att &quot;plocka ut&quot; ett intilliggande par av brickor n&aring;gonstans ur sekvensen, v&auml;nda p&aring; dem (vit blir svart, svart blir vit), och l&auml;gga tillbaka dem antingen i b&ouml;rjan av raden eller i slutet av raden, utan att &auml;ndra parets inb&ouml;rdes ordning.</p>

<p>Skriv ett program som, givet den ursprungliga raden av brickor, skriver ut det minsta antalet drag som beh&ouml;vs f&ouml;r att g&ouml;ra alla brickor vita.</p>

### 입력

<p>Indata best&aring;r av en str&auml;ng med enbart bokst&auml;verna <code>S</code> och <code>V</code>. Str&auml;ngen &auml;r mellan 3 och 15 tecken l&aring;ng.</p>

### 출력

<p>Skriv ut ett enda tal: det minsta antalet drag som beh&ouml;vs f&ouml;r att g&ouml;ra alla brickor vita. F&ouml;r givna testdata kommer det alltid vara m&ouml;jligt att n&aring; m&aring;let.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/20859.%E2%80%85Brickor/05632ad9.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/20859.%E2%80%85Brickor/05632ad9.png" data-original-src="https://upload.acmicpc.net/9274ba0c-5368-4130-b983-b5729bed8e8b/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 453px; height: 400px;" /></p>

<p style="text-align: center;">En m&ouml;jlig dragsekvens i exempel 2</p>