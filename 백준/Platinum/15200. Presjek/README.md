# [Platinum IV] Presjek - 15200

[문제 링크](https://www.acmicpc.net/problem/15200)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 10, 정답: 5, 맞힌 사람: 5, 정답 비율: 50.000%

### 분류

브루트포스 알고리즘, 기하학, 스위핑, 선분 교차 판정, 차분 배열 트릭, 볼록 다각형 내부의 점 판정

### 문제 설명

<p>Adrian vodenim bojicama crta konveksne poligone u koordinatnom sustavu. U nedostatku vremena neće im popunjavati unutra&scaron;njost, ali želi naglasiti redoslijed kojim su poredani tako da nijansa pojedine točke ruba poligona ovisi o broju poligona koji tu točku prekrivaju. Točnije, recimo da Adrian crta poligone p<sub>1</sub>, p<sub>2</sub>, . . . , p<sub>n</sub>, on će pojedini segment poligona p<sub>j</sub> nacrtati nijansom t ako se taj segment (osim možda njegovih krajnjih točaka) nalazi u unutra&scaron;njosti točno t od kasnijih poligona p<sub>j+1</sub>, . . . , p<sub>n</sub>.</p>

<p>Kada Adrian crta neki segment nijansom t on potro&scaron;i 1/(t+1) jedinica crne boje po jedinici duljine segmenta. Odredite ukupnu količinu boje koju Adrian treba potro&scaron;iti kako bi nacrtao sve poligone.</p>

### 입력

<p>U prvom redu se nalazi prirodni broj n (1 &le; n &le; 10) &mdash; broj poligona. Slijedi n blokova gdje k-ti blok sadrži opis poligona pk. U prvom redu bloka se nalazi prirodni broj m (3 &le; m &le; 20) &mdash; broj vrhova poligona. U svakom od sljedećih m redova se nalaze dva cijela broja x i y (0 &le; x, y &le; 100) &mdash; koordinate jednog vrha poligona. Vrhovi poligona su zadani u pozitivnom smjeru (suprotno od kazaljke na satu), a poligon je uvijek konveksan te ne sadrži uzastopne paralelne stranice.</p>

<p>Možete pretpostaviti da se različiti poligoni nikad ne dodiruju duž vrha ili stranice. Točnije ako su A i B dužine odnosno stranice različitih poligona p<sub>i</sub> i p<sub>j</sub> onda A i B uopće nemaju zajedničkih točaka ili se sijeku u točno jednoj točki koja leži u unutra&scaron;njosti dužina A i B.</p>

### 출력

<p>Ispi&scaron;ite traženu ukupnu količinu boje. Tolerirat će se apsolutno i relativno odstupanje od službenog rje&scaron;enja za 10<sup>&minus;6</sup>.</p>

### 힌트

<p>Sample 1:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15200.%E2%80%85Presjek/72f8786d.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15200.%E2%80%85Presjek/72f8786d.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15200/1.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:199px; width:172px" /></p>

<p>Sample 2:&nbsp;<img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/15200.%E2%80%85Presjek/33893679.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/15200.%E2%80%85Presjek/33893679.png" data-original-src="https://onlinejudgeimages.s3-ap-northeast-1.amazonaws.com/problem/15200/2.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:161px; width:184px" /></p>