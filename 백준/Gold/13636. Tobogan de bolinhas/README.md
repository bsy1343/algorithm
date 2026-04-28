# [Gold IV] Tobogan de bolinhas - 13636

[문제 링크](https://www.acmicpc.net/problem/13636)

### 성능 요약

시간 제한: 2 초, 메모리 제한: 512 MB

### 통계

제출: 25, 정답: 9, 맞힌 사람: 8, 정답 비율: 72.727%

### 분류

기하학, 삼분 탐색

### 문제 설명

<p>Uma f&aacute;brica quer produzir um tobogan de brinquedo como o da figura abaixo, composto de duas hastes de madeira sustentando aletas que se alternam nas duas hastes. Uma bolinha de a&ccedil;o &eacute; solta na aleta mais alta do tobogan; sob efeito da gravidade, a bolinha desliza pelas aletas, terminando por sair do brinquedo.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13636.%E2%80%85Tobogan%E2%80%85de%E2%80%85bolinhas/f95ff63c.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13636.%E2%80%85Tobogan%E2%80%85de%E2%80%85bolinhas/f95ff63c.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13636/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%209.19.49.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:168px; width:122px" /></p>

<p>O projeto do brinquedo, contendo as especifica&ccedil;&otilde;es do tamanho, posi&ccedil;&atilde;o e inclina&ccedil;&atilde;o das hastes e de cada aleta, foi feito pelo dono da f&aacute;brica, e milhares de unidades j&aacute; est&atilde;o sendo confeccionadas na China. O gerente da f&aacute;brica foi incumbido de comprar as bolinhas de a&ccedil;o, mas antes de fazer o pedido das milhares de bolinhas quer saber o di&acirc;metro m&aacute;ximo da bolinha, para que esta n&atilde;o pare no meio do brinquedo.</p>

<p><img alt="" src="%EB%B0%B1%EC%A4%80/Gold/13636.%E2%80%85Tobogan%E2%80%85de%E2%80%85bolinhas/c80bf06d.png" data-original-src="%EB%B0%B1%EC%A4%80/Gold/13636.%E2%80%85Tobogan%E2%80%85de%E2%80%85bolinhas/c80bf06d.png" data-original-src="https://onlinejudgeimages.s3.amazonaws.com/problem/13636/%EC%8A%A4%ED%81%AC%EB%A6%B0%EC%83%B7%202017-01-05%20%EC%98%A4%ED%9B%84%209.19.56.png" onerror="this.onerror=null;this.src=this.dataset.originalSrc" style="height:182px; width:250px" /><br />
Figura 1: Dois exemplos: em (a) a bolinha chega ao final, e (b) a bolinha para no meio do brinquedo e n&atilde;o chega ao final.</p>

<p>O gerente da f&aacute;brica quer que voc&ecirc; escreva um programa que, dadas as especifica&ccedil;&otilde;es do brinquedo, determine o di&acirc;metro m&aacute;ximo da bolinha para que esta n&atilde;o pare no meio do brinquedo.</p>

### 입력

<p>A primeira linha de um caso de teste cont&eacute;m um inteiro N indicando o n&uacute;mero de aletas do brinquedo. A segunda linha cont&eacute;m dois inteiros L e H, indicando respectivamente a dist&acirc;ncia entre as hastes e a altura das hastes do brinquedo. A haste esquerda do brinquedo est&aacute; na posi&ccedil;&atilde;o 0 do eixo de coordenadas X, de forma que a haste direita est&aacute; na posi&ccedil;&atilde;o L do eixo X.</p>

<p>Cada uma das N linhas seguintes descreve uma aleta. As aletas s&atilde;o descritas da mais alta para a mais baixa, de forma alternada em rela&ccedil;&atilde;o &agrave; haste na qual a aleta est&aacute; conectada. A aleta mais alta&nbsp;do brinquedo (a primeira a ser descrita) tem a extremidade ligada &agrave; haste esquerda; a segunda aleta mais alta (a segunda a ser descrita) tem a extremidade ligada &agrave; haste direita, assim alternadamente. As aletas &iacute;mpares t&ecirc;m a extremidade ligada &agrave; haste esquerda, as aletas pares t&ecirc;m a extremidade ligada &agrave; haste direita.</p>

<p>Cada aleta &eacute; descrita em uma linha contendo tr&ecirc;s n&uacute;meros inteiros Y<sub>i</sub>, X<sub>f</sub> e Y<sub>f</sub> , separados por um espa&ccedil;o em branco. (X<sub>f</sub> , Y<sub>f</sub> ) indica a coordenada do final da aleta; para aletas &iacute;mpares a coordenada do in&iacute;cio da aleta &eacute; (0, Y<sub>i</sub>), e para aletas pares a coordenada do in&iacute;cio da aleta &eacute; (L, Y<sub>i</sub>).</p>

<p>Para todas as aletas Y<sub>i</sub> &gt; Y<sub>f</sub> (ou seja, h&aacute; um declive entre o in&iacute;cio e o final da aleta), e o comprimento da aleta &eacute; menor do que a largura do brinquedo. Al&eacute;m disso, para duas aletas consecutivas A e B, Y<sub>fA</sub> &gt;= Y<sub>iB</sub> (ou seja, o final da aleta A tem altura maior do que ou igual ao in&iacute;cio da aleta B).</p>

<p>Considere que as aletas s&atilde;o muito finas, de forma que a sua espessura pode ser desconsiderada, e que a sua largura &eacute; sempre maior do que o di&acirc;metro da bolinha (ou seja, a bolinha sempre tem espa&ccedil;o lateral para deslizar pela aleta).</p>

<p>Restri&ccedil;&otilde;es</p>

<ul>
	<li>1 &le; N &le; 10<sup>3</sup></li>
	<li>1 &le; L &le; 10<sup>3</sup></li>
	<li>1 &le; H &le; 10<sup>3</sup></li>
	<li>0 &lt; X<sub>f</sub> &lt; L</li>
	<li>0 &le; Y<sub>i </sub>&le; H, 0 &le; Y<sub>f</sub> &le; H e Y<sub>i</sub> &gt; Y<sub>f</sub></li>
</ul>

### 출력

<p>Para cada caso de teste imprima uma linha contendo um &uacute;nico n&uacute;mero, com exatamente duas casas decimais, indicando o maior di&acirc;metro de bolinha tal que esta consiga percorrer todo o brinquedo.</p>