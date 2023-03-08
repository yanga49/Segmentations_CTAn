"""


:author: Anna Yang
:contact:
:email: yanganna259@gmail.com
:organization: Western University
:address:
:copyright:
:date: May 16 2022 16:04
:dragonflyVersion: 2021.3.0.1087
:UUID: 659f0c84d55311ecade0708bcd504024
"""

__version__ = '1.0.1'

# Action log Mon May 16 16:04:30 2022

# Macro name: dilate 10*5, fill, erode 10*5

# ********** BEGIN MACRO ********** #
"""
Applies a morphological dilation operation on a ROI or a MultiROI.

:name: dilate
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
for i in range(20):
   OrsVolumeROITools.dilate(aROIToModify=aROIToModify,
                            kernelShape=kernelShape,
                            kernelDim=kernelDim,
                            kernelSize=kernelSize,
                            currentTime=currentTime,
                            axis=axis,
                            sliceIndicesExpr=sliceIndicesExpr)

# ********** END MACRO ********** #

# ********** BEGIN MACRO ********** #
"""
Creates a new instance of class Progress

:name: __new__
:execution: execute

:return aProgress: the created instance of class Progress
:rtype aProgress: ORSModel.ors.Progress
"""

# Interface method
aProgress = Progress(logging=True)

# ----- BEGIN RETURNED VALUES DEFINITION ----- #
# aProgress = orsObj('B9884453FE664A53A7CE0ED8ECE51B5BCxvProgress')

# ----- END RETURNED VALUES DEFINITION ----- #
# ********** END MACRO ********** #

# ********** BEGIN MACRO ********** #
"""
:name: startWorkingProgressWithID
:execution: execute

:param aProgress:
:type aProgress: ORSModel.ors.Progress
:param iID:
:type iID: int
:param bCancellable:
:type bCancellable: bool
"""

# ----- BEGIN INPUT ARGUMENT DEFINITION ----- #
iID = 45

bCancellable = False

# ----- END INPUT ARGUMENT DEFINITION ----- #
# Interface method
aProgress.startWorkingProgressWithID(iID=iID,
                                    bCancellable=bCancellable,
                                    logging=True)

# ********** END MACRO ********** #

# ********** BEGIN MACRO ********** #
"""
Applies a filling of inner areas on a ROI or a MultiROI.

:name: fillInnerAreas
:execution: execute

:param aROIToModify: ROI or MultiROI to modify
:type aROIToModify: ORSModel.ors.ROI, ORSModel.ors.MultiROI
:param fillInnerAreasMode: Filling mode ('3D', '2D (X)', '2D (Y)' or '2D (Z)')
:type fillInnerAreasMode: str
:param currentTime_2: Time step of the operation
:type currentTime_2: int
"""

# ----- BEGIN INPUT ARGUMENT DEFINITION ----- #
fillInnerAreasMode = '3D'

currentTime_2 = 0

# ----- END INPUT ARGUMENT DEFINITION ----- #
# Interface method
OrsVolumeROITools.fillInnerAreas(aROIToModify=aROIToModify,
                                fillInnerAreasMode=fillInnerAreasMode,
                                currentTime=currentTime_2)

# ********** END MACRO ********** #

# ********** BEGIN MACRO ********** #
"""
:name: deleteObject
:execution: execute

:param aProgress:
:type aProgress: ORSModel.ors.Managed
"""

# Interface method
aProgress.deleteObject(logging=True)

# ********** END MACRO ********** #

# ********** BEGIN MACRO ********** #
"""
Applies a morphological erosion operation on a ROI or a MultiROI.

:name: erode
:execution: execute

:param aROIToModify: ROI or MultiROI to modify
:type aROIToModify: ORSModel.ors.ROI, ORSModel.ors.MultiROI
:param kernelShape_2: Kernel shape ('square', 'circle' or 'cross')
:type kernelShape_2: str
:param kernelDim_2: Kernel dimension (2 or 3)
:type kernelDim_2: int
:param kernelSize_2: Kernel size (odd number between 3 and 33)
:type kernelSize_2: int
:param currentTime_3: Time step of the ROI
:type currentTime_3: int
:param axis_2: axis of operation if 2D kernel 0=X, 1=Y, 2=Z of the StructuredGrid
:type axis_2: int
:param sliceIndicesExpr_2: slices to work on in the given axis (string expression, 1-based, e.g. '1,2,3-5,4-20/3')
:type sliceIndicesExpr_2: str
"""

# ----- BEGIN INPUT ARGUMENT DEFINITION ----- #
kernelShape_2 = 'square'

kernelDim_2 = 3

kernelSize_2 = 5

currentTime_3 = 0

axis_2 = 2

sliceIndicesExpr_2 = ''

# ----- END INPUT ARGUMENT DEFINITION ----- #
# Interface method
for i in range(20):
   OrsVolumeROITools.erode(aROIToModify=aROIToModify,
                           kernelShape=kernelShape_2,
                           kernelDim=kernelDim_2,
                           kernelSize=kernelSize_2,
                           currentTime=currentTime_3,
                           axis=axis_2,
                           sliceIndicesExpr=sliceIndicesExpr_2)

# ********** END MACRO ********** #


