# [Platinum IV] Corte - 13619

[문제 링크](https://www.acmicpc.net/problem/13619)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 23, 정답: 9, 맞힌 사람: 6, 정답 비율: 46.154%

### 분류

다이나믹 프로그래밍, 기하학

### 문제 설명

<p>Todo pol&iacute;gono convexo, com 2N v&eacute;rtices, pode ser decomposto em N &minus; 1 quadril ́ateros, fazendo-se N &minus; 2 cortes em linha reta entre certos pares de v&eacute;rtices. A figura abaixo ilustra tr&ecirc;s diferentes decomposi&ccedil;&otilde;oes do mesmo pol&iacute;gono com N = 5. O peso da decomposi&ccedil;&atilde;o &eacute; a soma dos comprimentos de seus N &minus; 2 cortes. Seu programa deve computar o peso de uma decomposi&ccedil;&atilde;o de peso m&iacute;nimo!</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13619.%E2%80%85Corte/6262748b.png" data-original-src="%EB%B0%B1%EC%A4%80/Platinum/13619.%E2%80%85Corte/6262748b.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13619/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%207.04.50.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:128px; width:570px" /></p>

### 입력

<p>A primeira linha da entrada cont&eacute;m um inteiro N (2 &le; N &le; 100). As 2N linhas seguintes cont&eacute;m cada uma dois n&uacute;meros reais X e Y (0 &le; X, Y &le; 10000), com precis&atilde;o de 4 casas decimais: as coordenadas dos 2N pontos, em sentido anti-hor&aacute;rio, do pol&iacute;gono convexo.</p>

### 출력

<p>Seu programa deve imprimir uma linha contendo um n&uacute;mero real, com precis&atilde;o de 4 casas decimais. O n&uacute;mero deve ser o peso de uma decomposi&ccedil;&atilde;o de peso m&iacute;nimo do pol&iacute;gono dado.</p>