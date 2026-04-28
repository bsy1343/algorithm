# [Gold II] Arhimed - 14101

[문제 링크](https://www.acmicpc.net/problem/14101)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 128 MB

### 통계

제출: 13, 정답: 4, 맞힌 사람: 4, 정답 비율: 66.667%

### 분류

브루트포스 알고리즘, 기하학, 최소 외접원

### 문제 설명

<p>Poznata je Arhimedova rečenica: &bdquo;Ne diraj moje krugove!&ldquo;</p>

<p>Manje je poznato &scaron;to je on zapravo rje&scaron;avao u pijesku. On je nacrtao N crnih i M bijelih točaka.</p>

<p>Poku&scaron;avao je rije&scaron;iti sljedeći problem: koja kružnica određena s tri crne točke unutar sebe sadrži najvi&scaron;e bijelih točaka? Smatramo da je neka bijela točka unutar kružnice ako je dio kruga koji ta kružnica omeđuje.</p>

<p>Mladi Andro saznao je za Arhimedov problem te je odlučio rije&scaron;iti taj problem star preko 2000 godina. Andro je zbunjen kao i obično pa mu je potrebna va&scaron;a pomoć. Pomognite mu i pronađite najveći broj bijelih točaka koje se nalaze unutar neke kružnice koja je opisana trokutu čiji su vrhovi tri crne točke.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/14101.%E2%80%85Arhimed/8ab31b00.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/14101.%E2%80%85Arhimed/8ab31b00.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/14101/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-02%20%EC%98%A4%ED%9B%84%204.48.09.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:282px; width:317px" /><br />
Slika predstavlja primjer gdje je rje&scaron;enje 3, konkretnije kružnica definirana točkama A, B i C sadrži tri bijele točke. Kružnica A, B, D također sadrži 3 bijele točke. Kružnica B, C, D sadrži jednu točku. Primjetite da ne postoji kružnica koja prolazi točkama A, C, D.</p>

### 입력

<p>U prvom retku nalazi se prirodan broj N (1 &le; N &le; 200), broj crnih točaka.</p>

<p>U sljedećih N redaka nalaze se koordinate crnih točaka, dva cijela broja koja su po apsolutnoj vrijednosti manja od 10 000.</p>

<p>U sljedećem retku nalazi se prirodan broj M (1 &le; M &le; 200), broj bijelih točaka.</p>

<p>U sljedećih M redaka nalaze se koordinate bijelih točaka, dva cijela broja koja su po apsolutnoj vrijednosti manja od 10 000.</p>

<p>Sve točke u ulazu su različite, niti jedna bijela točka ne leži na nekoj od kružnica određenih s tri crne točke.&nbsp;</p>

### 출력

<p>U prvom i jedinom retku ispi&scaron;ite najveći broj bijelih točaka koje se nalaze unutar kružnice određene s tri crne točke.</p>