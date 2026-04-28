# [Silver IV] Pizza do Vô Pepe - 13620

[문제 링크](https://www.acmicpc.net/problem/13620)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 78, 정답: 25, 맞힌 사람: 18, 정답 비율: 29.032%

### 분류

브루트포스 알고리즘

### 문제 설명

<p>Vov&ocirc; Pepe &eacute; famoso por suas pizzas. Elas s&atilde;o deliciosas, e t&ecirc;m o formato de um c&iacute;rculo perfeito. Vov&ocirc; preparou uma pizza especial para o jantar de hoje &agrave; noite, e colocou um certo n&uacute;mero de azeitonas distribu&iacute;das aleatoriamente, mas colocadas exatamente na borda da pizza.</p>

<p>Sua tarefa &eacute; determinar, conhecendo a circunfer&ecirc;ncia da pizza, a quantidade de azeitonas e a posi&ccedil;&atilde;o de cada azeitona, se &eacute; poss&iacute;vel dividir a pizza em setores circulares de mesmo tamanho, de tal forma que cada peda&ccedil;o de pizza contenha exatamente uma azeitona.</p>

<p>A figura abaixo mostra (a) uma pizza de circunfer&ecirc;ncia 12 com 3 azeitonas e uma poss&iacute;vel divis&atilde;o em peda&ccedil;os iguais; e (b) uma pizza de circunfer&ecirc;ncia 12 com 4 azeitonas que n&atilde;o pode ser dividida em peda&ccedil;os iguais como descrito acima. Apesar de deliciosas, as azeitonas s&atilde;o muito pequenas, e suas dimens&otilde;es podem ser desconsideradas no c&aacute;lculo da divis&atilde;o.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Silver/13620.%E2%80%85Pizza%E2%80%85do%E2%80%85V%C3%B4%E2%80%85Pepe/140be6b5.png" data-original-src="%EB%B0%B1%EC%A4%80/Silver/13620.%E2%80%85Pizza%E2%80%85do%E2%80%85V%C3%B4%E2%80%85Pepe/140be6b5.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13620/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%207.06.39.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:187px; width:359px" /></p>

### 입력

<p>A primeira linha cont&eacute;m dois inteiros C (3 &le; C &le; 10<sup>5</sup> ) e N (3 &le; N &le; 10<sup>4</sup> , N &le; C) representando respectivamente a circunfer&ecirc;ncia da pizza e o n&uacute;mero de azeitonas. O inteiro C &eacute; m&uacute;ltiplo de N. A segunda linha cont&eacute;m N inteiros distintos X<sub>i</sub> (0 &le; X<sub>1</sub> &lt; X<sub>2</sub> &lt; . . . &lt; X<sub>N</sub> &lt; C), em ordem crescente, descrevendo as posi&ccedil;&otilde;es das azeitonas, dadas pelo comprimento do arco circular no sentido hor&aacute;rio, a partir de um ponto fixo da circunfer&ecirc;ncia.</p>

### 출력

<p>Seu programa deve produzir apenas uma linha, com apenas uma letra, que deve ser S se &eacute; poss&iacute;vel dividir a pizza como descrito acima, ou N caso contr&aacute;rio.</p>