# [Platinum V] Estrela - 13646

[문제 링크](https://www.acmicpc.net/problem/13646)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 388, 정답: 176, 맞힌 사람: 142, 정답 비율: 45.367%

### 분류

수학, 정수론, 오일러 피 함수

### 문제 설명

<p>Fernando ganhou um compasso de anivers&aacute;rio, e agora sua divers&atilde;o favorita &eacute; desenhar estrelas: primeiro, ele marca N pontos sobre a circunfer&ecirc;ncia, dividindo-a em N arcos iguais; depois, ele liga cada ponto ao k-&eacute;simo ponto seguinte, at&eacute; voltar ao ponto inicial.</p>

<p>Dependendo do valor de k, Fernando pode ou n&atilde;o atingir todos os pontos marcados sobre a circunfer&ecirc;ncia; quando isto acontece, a estrela &eacute; chamada de completa. Por exemplo, quando N = 8, as poss&iacute;veis estrelas s&atilde;o as mostradas no desenho abaixo; as estrelas (a) e (c) s&atilde;o completas, enquanto as estrelas (b) e (d) n&atilde;o o s&atilde;o.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Platinum/13646.%E2%80%85Estrela/e8d78ab5.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13646/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%209.40.59.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:148px; width:609px" />Dependendo do valor de N, pode ser poss&iacute;vel desenhar muitas estrelas diferentes; Fernando pediu que voc&ecirc; escrevesse um programa que, dado N, determina o n&uacute;mero de estrelas completas que ele pode desenhar.</p>

### 입력

<p>Cada caso de teste cont&eacute;m de uma &uacute;nica linha, contendo um &uacute;nico inteiro N, indicando o n&uacute;mero de arcos no qual a circunfer&ecirc;ncia foi dividida.</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>3 &le; N &lt; 2<sup>31</sup></li>
</ul>

### 출력

<p>Para cada caso de teste, seu programa deve imprimir uma &uacute;nica linha contendo um &uacute;nico inteiro, indicando o n&uacute;mero de estrelas completas que podem ser desenhadas.</p>