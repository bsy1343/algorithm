# [Platinum II] Glomazna Gužva - 26299

[문제 링크](https://www.acmicpc.net/problem/26299)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 1024 MB

### 통계

제출: 6, 정답: 2, 맞힌 사람: 2, 정답 비율: 100.000%

### 분류

값 / 좌표 압축, 데이크스트라, 그래프 이론, 그래프 탐색, 최단 경로

### 문제 설명

<p>Zagreb je u posljednje vrijeme postao popularna destinacija za održavanje raznih diplomatskih susreta. Predsjednici, premijeri, patrijarsi, kraljevi, vojvode i generali naprosto uživaju vozeći se pustim zagrebačkim ulicama pod policijskom pratnjom.</p>

<p>Zagreb možemo (pojednostavljeno) predstaviti pravokutnom mrežom ulica, gdje se svako križanje nalazi na cjelobrojnim koordinatama. Da biste (direktno) proputovali od križanja A na koordinatama (x<sub>A</sub>, y<sub>A</sub>) do križanja B na koordinatama (x<sub>B</sub>, y<sub>B</sub>), morate se provozati kroz točno |x<sub>A</sub> &minus; x<sub>B</sub>| + |y<sub>A</sub> &minus; y<sub>B</sub>| blokova. U normalnim uvjetima (bez gužve), putovanje kroz jedan blok traje točno 10 minuta.</p>

<p>Međutim, svaki diplomatski posjet rezultira glomaznom gužvom na nekom pravokutnom području grada. Sve ceste koje se nalaze strogo unutar tog područja jednako su zahvaćene gužvom, a njihova prohodnost (vrijeme prolaska bloka) ovisi o važnosti tog specifičnog diplomatskog posjeta. Dakako, vi&scaron;e se diplomatskih posjeta može događati istovremeno, ali niti jedna dva pravokutna područja nikad se ne sijeku niti diraju.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/26299.%E2%80%85Glomazna%E2%80%85Gu%C5%BEva/f735fccd.png" data-original-src="https://upload.acmicpc.net/96204aab-535b-458e-8abf-cbe91bf2b7c5/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 411px; height: 269px;" /></p>

<p>Za dano stanje u prometu u gradu Zagrebu, odredite najkraće vrijeme potrebno da se proputuje od zadanog početnog do zadanog zavr&scaron;nog križanja.</p>

### 입력

<p>U prvom su retku četiri cijela broja x<sub>A</sub>, y<sub>A</sub>, x<sub>B</sub> i y<sub>B</sub> koji predstavljaju koordinate početnog i zavr&scaron;nog križanja, te su po apsolutnoj vrijednosti manji ili jednaki 10<sup>8</sup>.</p>

<p>U drugom se retku nalazi prirodan broj n (0 &le; n &le; 1 000) koji predstavlja broj diplomatskih posjeta koji se trenutno odvijaju u Zagrebu.</p>

<p>Idućih n redaka opisuju glomazne gužve, i to tako da i-ti redak sadrži brojeve x<sub>1,i</sub>, y<sub>1,i</sub>, x<sub>2,i</sub>, y<sub>2,i</sub> i t<sub>i</sub>. Prva četiri broja predstavljaju koordinate donjeg-lijevog i gornjeg-desnog ruba gužvom zahvaćenog područja (x<sub>1,i</sub> &lt; x<sub>2,i</sub>, y<sub>1,i</sub> &lt; y<sub>2,i</sub>), dok broj t<sub>i</sub> (10 &lt; t<sub>i</sub> &le; 10<sup>8</sup>) predstavlja vrijeme potrebno da se proputuje jednim blokom unutar tog područja.</p>

<p>Pravokutna područja iz ulaza neće se sijeći niti dirati, a lokacije početnog i zavr&scaron;nog križanja bit će različite i neće se nalaziti unutar niti na rubu nekog pravokutnog područja.</p>

### 출력

<p>U jedinom se retku nalazi prirodan broj koji označava najkraće vrijeme potrebno da se proputuje od križanja A do križanja B.</p>

### 힌트

<p>Poja&scaron;njenje prvog probnog primjera: primjer odgovara skici iz zadatka.</p>