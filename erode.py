"""


:author: Anna Yang
:contact:
:email: yanganna259@gmail.com
:organization: Western University
:address:
:copyright:
:date: May 16 2022 14:38
:dragonflyVersion: 2021.3.0.1087
:UUID: 53440a56d54711ec8eaa708bcd504024
"""

__version__ = '1.0.1'

# Action log Mon May 16 14:38:05 2022

# Macro name: erode 25*5

# ********** BEGIN MACRO ********** #
"""
Applies a morphological erosion operation on a ROI or a MultiROI.

:name: erode
:execution: execute

:param aROIToModify: ROI or MultiROI to modify
:type aROIToModify: ORSModel.ors.ROI, ORSModel.ors.MultiROI
:param kernelShape: Kernel shape ('square', 'circle' or 'cross')
:type kernelShape: str
:param kernelDim: Kernel dimension (2 or 3)
:type kernelDim: int
:param kernelSize: Kernel size (odd number between 3 and 33)
:type kernelSize: int
:param currentTime: Time step of the ROI
:type currentTime: int
:param axis: axis of operation if 2D kernel 0=X, 1=Y, 2=Z of the StructuredGrid
:type axis: int
:param sliceIndicesExpr: slices to work on in the given axis (string expression, 1-based, e.g. '1,2,3-5,4-20/3')
:type sliceIndicesExpr: str
"""

# ----- BEGIN INPUT ARGUMENT DEFINITION ----- #
kernelShape = 'square'

kernelDim = 3

kernelSize = 5

currentTime = 0

axis = 2

sliceIndicesExpr = ''

# ----- END INPUT ARGUMENT DEFINITION ----- #
# Interface method
for i in range(50):
   OrsVolumeROITools.erode(aROIToModify=aROIToModify,
                           kernelShape=kernelShape,
                           kernelDim=kernelDim,
                           kernelSize=kernelSize,
                           currentTime=currentTime,
                           axis=axis,
                           sliceIndicesExpr=sliceIndicesExpr)

# ********** END MACRO ********** #


