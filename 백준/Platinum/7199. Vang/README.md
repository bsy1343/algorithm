# [Platinum V] Vang - 7199

[문제 링크](https://www.acmicpc.net/problem/7199)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 10, 정답: 2, 맞힌 사람: 2, 정답 비율: 25.000%

### 분류

너비 우선 탐색, 기하학, 그래프 이론, 그래프 탐색, 구현, 오목 다각형 내부의 점 판정

### 문제 설명

<p>Vanglal on hulknurkne hoov, mille seinad on kõik kas põhja-lõuna või ida-lääne suunalised ning iga seina pikkus on täisarv meetreid. Hoovi seinte kirjeldus on antud sõnena üksikute meetrite kaupa: <code>W</code> &mdash; läände, <code>N</code> &mdash; põhja, <code>E</code> &mdash; itta, <code>S</code> &mdash; lõunasse. On teada, et seinad ei lõika ega puutu uksteist ning moodustavad kinnise hulknurga.</p>

<p>Vanglahoovis on põgenema pääsenud vang, keda ajab taga valvur. Vangil on jala küljes pomm, mis takistab tal kiiresti jooksmist, seetõttu jookseb valvur vangist kaks korda kiiremini. Vang ja valvur teevad kordamööda käike, kusjuures vang alustab.</p>

<p>Kui kujutleda, et vanglahoov moodustab üheruutmeetristest ruutudest koosneva ruudustiku, siis vang liigub igal käigul mõnele naaberruudule (või seisab paigal). Valvur teeb oma käigul kaks samasugust liigutust. Liikumine toimub ainult horisontaalselt või vertikaalselt, mitte diagonaalis.</p>

<p>Eeldades, et vang püüab võimalikult kaua valvuri eest kõrvale hoida ning valvur katsub vangi võimalikult kiiresti tabada, leida, mitmendal enda käigul valvur vangi kätte saab.</p>

### 입력

<p>Tekstifailis on täpselt neli rida. Esimesel real on hoovi seinte kogupikkus K (8 &le; K &le; 6 000). Teisel real on sõne pikkusega K, mis koosneb märkidest <code>N</code>, <code>E</code>, <code>S</code> ja <code>W</code>. Kolmandal real on kaks tühikuga eraldatud täisarvu, mis tähistavad vangi X- ja Y-koordinaate. Neljandal real on kaks tühikuga eraldatud täisarvu, mis tähistavad valvuri X- ja Y-koordinaate.</p>

<p>Seinte kirjelduse alguspunktist vahetult kirdesse (diagonaalis põhja ja ida poole) jääva ruudu koordinaadid on (0; 0) ning X-koordinaadid kasvavad ida ja Y-koordinaadid põhja suunas. Vang ja valvur asuvad alguses alati erinevatel ruutudel. Asukohad on alati hoovis sees.</p>

### 출력

<p>Tekstifaili väljastada täpselt üks täisarv, mis näitab, mitmendal käigul valvur vangi kätte saab.</p>

### 힌트

<p></p>