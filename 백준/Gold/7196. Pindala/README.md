# [Gold V] Pindala - 7196

[문제 링크](https://www.acmicpc.net/problem/7196)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 44, 정답: 28, 맞힌 사람: 27, 정답 비율: 62.791%

### 분류

기하학, 다각형의 넓이

### 문제 설명

<p>Ruudulisele paberile saab joonistada kinniseid hulknurki, järgides ainult ruudustiku jooni. See tähendab, et kõik hulknurga küljed on horisontaalsed või vertikaalsed ning täisarvuliste pikkustega. Iga hulknurga joonistamise eeskiri on antud sõnena üksikute lõikude kaupa: <code>W</code> &mdash; vasakule, <code>N</code> &mdash; üles, <code>E</code> &mdash; paremale, <code>S</code> &mdash; alla. On teada, et hulknurk ei puutu ega lõika iseennast, s.t iga punkt hulknurga kirjelduses esineb ainult uks kord.</p>

<p>Hulknurk on ka ortogonaalselt kumer. See tähendab, et iga horisontaalne või vertikaalne sirge, mis hulknurka lõikab, siseneb sellesse ja väljub sellest ainult ühe korra. Lihtsustatult, hulknurk ei sisalda näiteks U-kujulisi osi. Näiteks <code>NNWSWSEE</code> (joonisel vasakul) annab ortogonaalselt kumera hulknurga, aga <code>SSEEENNWSWNW</code> (joonisel paremal) mitte.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7196.%E2%80%85Pindala/de8e6edb.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7196.%E2%80%85Pindala/de8e6edb.png" data-original-src="https://upload.acmicpc.net/91a5eefa-b293-4b0d-9544-20036a93c15f/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 356px; height: 93px;" /></p>

<p>Leida selliselt antud hulknurga pindala.</p>

### 입력

<p>Tekstifailis on täpselt kaks rida. Esimesel real on lõikude arv K (4 &le; K &le; 1 000 000). Teisel real on sõne pikkusega K, mis koosneb märkidest <code>N</code>, <code>E</code>, <code>S</code> ja <code>W</code>.</p>

### 출력

<p>Tekstifaili väljastada täpselt üks täisarv, sisendis kirjeldatud hulknurga pindala.</p>

### 힌트

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/7196.%E2%80%85Pindala/4c724154.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/7196.%E2%80%85Pindala/4c724154.png" data-original-src="https://upload.acmicpc.net/1fa857af-4ed3-4ad4-8a84-af07d062d844/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 88px; height: 93px;" /></p>