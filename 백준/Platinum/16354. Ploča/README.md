# [Platinum V] Ploča - 16354

[문제 링크](https://www.acmicpc.net/problem/16354)

### 성능 요약

시간 제한: 1 초, 메모리 제한: 512 MB

### 통계

제출: 14, 정답: 7, 맞힌 사람: 5, 정답 비율: 55.556%

### 분류

다이나믹 프로그래밍, 재귀

### 문제 설명

<p>Mladi Marin slobodno vrijeme provodi zureći u dio koordinatne ravnine omeđen zami&scaron;ljenim kvadratom čiji se donji lijevi kut nalazi u točki (&minus;2<sup>n</sup> + 1, &minus;2<sup>n</sup> + 1), a gornji desni kut u točki (2<sup>n</sup> &minus; 1, 2<sup>n</sup> &minus; 1). Marin je na tom dijelu ravnine odlučio istaknuti točke čije su obje koordinate neparni brojevi. Istaknute točke označit će prirodnim brojevima između 1 i 4<sup>n</sup>.</p>

<p>Naprije je zaključio da želi da su oznake svih točaka prvog kvadranta strogo manje od oznaka svih točaka drugog kvadranta. Nadalje, želi da su oznake svih točaka drugog kvadranta manje od oznaka svih točaka trećeg kvadranta, te da su oznake svih točaka trećeg kvadranta manje od svih oznaka četvrtog kvadranta. Potom je odlučio da će skupu točaka svakog kvadranta oznake pridijeliti analognim rekurzivnim postupkom pri čemu će ulogu ishodi&scaron;ta nekog kvadranta preuzeti sjeci&scaron;te horizontalne i vertikalne osi simetrije skupa točaka tog kvadranta.</p>

<p style="text-align: center;"><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/16354.%E2%80%85Plo%C4%8Da/db5117d0.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/16354.%E2%80%85Plo%C4%8Da/db5117d0.png" data-original-src="https://upload.acmicpc.net/6c966600-ce1b-4da4-8d88-44f27f60aa5c/-/preview/" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="width: 234px; height: 238px;" /></p>

<p style="text-align: center;">Oznake istaknutih točaka za n = 2.</p>

<p>Marina sada zanima zbroj oznaka svih istaknutih točaka koje leže na pravcu x + y = k.</p>

### 입력

<p>U prvom redu nalaze se cijeli brojevi n i k (1 &le; n &le; 60) iz teksta zadatka. Broj k će biti takav da će barem jedna istaknuta točka ležati na pravcu x + y = k.</p>

### 출력

<p>Ispi&scaron;ite zbroj oznaka istaknutih toˇcaka koje leže na pravcu x + y = k modulo 10<sup>9</sup> + 7.</p>