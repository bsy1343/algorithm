# [Gold V] Idilični Instagram - 18284

[문제 링크](https://www.acmicpc.net/problem/18284)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 55, 정답: 16, 맞힌 사람: 16, 정답 비율: 32.000%

### 분류

그리디 알고리즘

### 문제 설명

<p>Alenka je odlučila postati nova instagram senzacija. Odmah je otvorila novi profil (@TheRealAlenka) i sada joj samo fali 190 milijuna pratitelja da prestigne tamo nekog portugalskog nogometa&scaron;a. Odlučila je slijediti tzv. <em>travelgram</em> trend, odnosno na svom će profilu dijeliti isključivo slike s putovanja. Krenula je redom, najprije Cape Town 1997. godine, zatim Setubal 1998. godine i tako sve do ovogodi&scaron;njeg ljetovanja u prijestolnici Azerbajdžana. Nažalost, skupila je pi&scaron;ljivih 100 milijuna pratitelja pa se za pomoć obratila gospodinu Malnaru.</p>

<p>Slike su na instagramu raspoređene u vi&scaron;e redaka, a svaki se redak sastoji od najvi&scaron;e tri slike. Također, slike su poredane po trenutku objave i to tako da se najnovija objava nalazi u gornjem lijevom kutu, a svaka sljedeća prati tzv. <em>redoslijed čitanja</em> &mdash; najprije slijeva nadesno, a zatim odozgo nadolje. Gospodin Malnar je odmah primijetio da su slike <strong>krivo preklopljene</strong>, odnosno, postoje retci u kojima se nalaze slike s različitih putovanja.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18284.%E2%80%85Idili%C4%8Dni%E2%80%85Instagram/859bad9e.png" data-original-src="https://upload.acmicpc.net/d3d37384-09aa-427f-87ab-0816d49d8493/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 380px; height: 153px;" /></p>

<p style="text-align: center;">Slike s putovannja A i B su na lijevoj figuri dobro preklopljene, dok na desnoj nisu.</p>

<p>Pomozite Alenki da izbri&scaron;e najmanji mogući broj slika sa svog instagram profila tako da slike koje ostanu budu dobro preklopljene. Kada se neka slika obri&scaron;e, njeno mjesto zauzima sljedeća slika po vremenu objave i tako sve dok se za jedno mjesto ne posmakne i najstarija objava.</p>

<p>Odredite konačan izgled Alenkinog instagram profila.</p>

### 입력

<p>U prvom se retku nalazi prirodni broj n (1 &le; n &le; 10<sup>5</sup>), broj Alenkinih objava.</p>

<p>U preostalim retcima nalazit će se ukupno n velikih slova engleske abecede i to najvi&scaron;e tri u svakom retku. Ti retci predstavljaju trenutni izgled Alenkinog instagram profila i to tako da svako slovo predstavlja jednu sliku, a ista slova označavaju da su odgovarajuće slike poslikane na istom putovanju.</p>

<p>Možete pretpostaviti da ulazni podaci odgovaraju tekstu zadatka, odnosno, samo se u posljednjem retku mogu nalaziti manje od tri slike te će redoslijed objava odgovarati kronolo&scaron;kom redoslijedu Alenkinih putovanja.</p>

### 출력

<p>U prvom retku ispi&scaron;ite broj Alenkinih objava u konačnoj verziji Alenkinog profila.</p>

<p>U preostalim retcima ispi&scaron;ite slike koje čine Alenkin profil u identičnom formatu kakav je u ulaznim podacima. Ako postoji vi&scaron;e točnih rje&scaron;enja, ispi&scaron;ite bilo koje.</p>

### 힌트

<p>Poja&scaron;njenje drugog probnog primjera:</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/18284.%E2%80%85Idili%C4%8Dni%E2%80%85Instagram/af36292a.png" data-original-src="https://upload.acmicpc.net/ccaccf7f-cf4a-4362-a4dd-9c5afc83365d/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 396px; height: 278px;" /></p>